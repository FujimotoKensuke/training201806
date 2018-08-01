//package com.web.controller;
//
//import com.domain.form.ItemCreateForm;
//import com.domain.form.UserCreateForm;
//import com.domain.model.UserModelFactory;
//import com.domain.model.ItemModel;
//import com.domain.service.UserCreateService;
//import com.domain.service.ItemService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;//依存性注入
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
////import com.domain.form.ItemCreateForm;
////import com.domain.model.ItemModelFactory;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.validation.BindingResult;
////import org.springframework.validation.annotation.Validated;
////import org.springframework.web.bind.annotation.ModelAttribute;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestMethod;
////import com.domain.service.ItemCreateService;
///**
// * ユーザー情報関連コントローラ
// *
// * @author k_fujimoto
// */
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserCreateService userCreateService;
//    
//
////    @Autowired
////    private ItemCreateService itemCreateService;
//    /**
//     * ユーザー情報登録(初期表示)API
//     */
//    @RequestMapping(value = "/userCreate", params = "init", method = RequestMethod.POST)
//    public String userCreateInit(@ModelAttribute UserCreateForm form, Model model) {
//        return "userCreate"; // 使用するテンプレートの名前を指定する
//    }
//
////    @RequestMapping(value = "/newCreate", params = "init", method = RequestMethod.POST)
////    public String userCreateInit(@ModelAttribute ItemCreateForm form, Model model) {
////        return "newCreate"; // 使用するテンプレートの名前を指定する
////    }
//    /**
//     * ユーザー情報登録(登録実行)API
//     */
//    @RequestMapping(value = "/userCreate", params = "enter", method = RequestMethod.POST)
//    public String userCreateDone(@Validated @ModelAttribute UserCreateForm form, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("validationError", "不正な値が入力されました。");
//            return userCreateInit(form, model);
//        }
//        userCreateService.create(UserModelFactory.create(form));
//
//        model.addAttribute("message", "ユーザーの新規登録が完了しました。");   // パラメタを渡す
//        return "userCreate"; // 使用するテンプレートの名前を指定する
//    }
//
//    
//    @RequestMapping(value = "/newCreate", params = "createLink", method = RequestMethod.POST)
//    public String newCreateInit(@ModelAttribute ItemCreateForm form, Model model) {
//        return "newCreate"; // 使用するテンプレートの名前を指定する
//    }
//    
//    @Autowired
//    private ItemService itemService;
//    
//    //アイテム情報習得API    
//    @RequestMapping(value = "/itemList", method = RequestMethod.GET)
//    public String getItemList(Model model){
//        
//        final List<ItemModel> itemModelList = itemService.getItemList();
//        model.addAttribute("itemModelList", itemModelList);
//        return "itemList";        
//    }
//}
