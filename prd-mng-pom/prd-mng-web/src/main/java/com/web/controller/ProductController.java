package com.web.controller;

import com.domain.form.RegistrationForm;
import com.domain.model.ProductModel;
import com.domain.model.ProductModelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.domain.service.ProductService;
import java.util.List;

/**
 * 商品情報関連コントローラ
 *
 * @author a26ishibashi
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService ProductService;

    /**
     * 商品情報登録(初期表示)API
     */
    @RequestMapping(value = "/registration", params = "init", method = RequestMethod.POST)
    public String registrationInit(@ModelAttribute RegistrationForm form, Model model) {
        return "registration"; // 使用するテンプレートの名前を指定する
    }

    /**
     * ユーザー情報登録(登録実行)API
     */
    @RequestMapping(value = "/registration", params = "enter", method = RequestMethod.POST)
    public String registrationDone(@Validated @ModelAttribute RegistrationForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("validationError", "不正な値が入力されました。");
            return registrationInit(form, model);
        }
        ProductService.create(ProductModelFactory.create(form));

        model.addAttribute("message", "商品の新規登録が完了しました。");   // パラメタを渡す
        return "registration"; // 使用するテンプレートの名前を指定する
    }
     /**
     * 商品情報取得API
     */
    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public String getProductList(Model model) {

        final List<ProductModel> productModelList = ProductService.getProductList();
        model.addAttribute("productModelList", productModelList);   // パラメタを渡す
        return "productList"; // 使用するテンプレートの名前を指定する
    }
}

