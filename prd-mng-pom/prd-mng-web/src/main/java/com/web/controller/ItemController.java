package com.web.controller;

import com.domain.form.ItemCreateForm;
import com.domain.model.ItemModel;
import com.domain.service.ItemService;
import com.domain.model.ItemModelFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.BindingResult;


/**
 *
 * @author Naoto Endo
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

     //トップ画面表示（初期表示）API   
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String top(Model model) {
        return "top"; // 使用するテンプレートの名前を指定する
    }
       
    //アイテム情報習得（初期表示）API    
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String getItemList(Model model) {
        final List<ItemModel> itemModelList = itemService.getItemList();
        model.addAttribute("itemModelList", itemModelList);
        return "list";
    }
        
     //アイテム情報登録（初期表示）API
    @RequestMapping(value = "/newCreate", method = RequestMethod.POST) 
    public String newCreateInit(@ModelAttribute ItemCreateForm form, Model model) {
        return "newCreate"; // 使用するテンプレートの名前を指定する
    }
    
    //アイテム情報登録（登録実行）API
    @RequestMapping(value = "/newCreate", params = "enter", method = RequestMethod.POST) 
    public String newCreateDone(@Validated @ModelAttribute ItemCreateForm form, BindingResult result, Model model) {
        if(result.hasErrors()){
            model.addAttribute("validationError","不正な値が入力されました");
            return newCreateInit(form,model);
        }
        itemService.create(ItemModelFactory.create(form));
        
        model.addAttribute("message","アイテムの新規登録が完了しました。");
        return "newCreate";
    }
    
    //アイテム情報登録（更新）API
    /*@param itemModel
    *@param model
    *@return    
    */    
    @RequestMapping(value="/itemUpdate",method={RequestMethod.POST,RequestMethod.GET})
    public String itemUpdateDone(@Validated @ModelAttribute ItemCreateForm form,BindingResult result,Model model) throws Exception{
         if(result.hasErrors()){
            model.addAttribute("validationError","不正な値が入力されました");
            return newCreateInit(form,model);
        }
         
        itemService.update(ItemModelFactory.create(form));
        
        model.addAttribute("message","情報を更新しました。");     
        model.addAttribute("updateFlg",1);
        return "/itemUpdate";
    }
    
    
    
    
    
}
