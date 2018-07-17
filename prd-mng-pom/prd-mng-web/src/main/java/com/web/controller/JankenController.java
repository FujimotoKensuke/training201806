package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * じゃんけんコントローラ
 *
 * @author k_fujimoto 追記編集
 */
@Controller
public class JankenController {
    
    /**
     * 初期画面表示API
     */
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model) {
//        model.addAttribute("message", "ハロー, Spring Boot!");   // パラメタを渡す
//        return "index"; // 使用するテンプレートの名前を指定する
//    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String top(Model model) {
        model.addAttribute("message", "ハロー, Spring Boot!");   // パラメタを渡す
        return "top"; // 使用するテンプレートの名前を指定する
    }

    /**
     * 対戦画面表示API
     */
//    @RequestMapping(value = "/battle", method = RequestMethod.POST)
//    public String battle(Model model) {
//        model.addAttribute("message", "じゃん…けん…");   // パラメタを渡す
//        return "battle"; // 使用するテンプレートの名前を指定する
//    }
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String list(Model model) {
            return "list"; // 使用するテンプレートの名前を指定する
    }

    /**
     * 対戦結果取得API
     */
//    @RequestMapping(value = "/result", method = RequestMethod.GET)
//    public String result(Model model) {
//        model.addAttribute("message", "じゃん…けん…");   // パラメタを渡す
//        return "result"; // 使用するテンプレートの名前を指定する
//    }
    
}
