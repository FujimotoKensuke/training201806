package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商品管理コントローラ
 *
 * @author a26ishibashi
 */
@Controller
public class MerchandiseController {

    /**
     * 初期画面表示API
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String top(Model model) {
        //model.addAttribute("message", "Hello, Spring Boot!");   // パラメタを渡す
        return "top"; // 使用するテンプレートの名前を指定する
    }

}
