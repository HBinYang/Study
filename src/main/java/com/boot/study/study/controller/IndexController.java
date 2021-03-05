package com.boot.study.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HBYang
 * @date 2021/3/4 15:27
 */
//自动识别扫描当前的类，把它作为spring的一个Bean去管理，同时识别它为一个controller，controller就是允许这个类去接受前端的一个请求
@Controller
public class IndexController {
    @GetMapping("/") //表示根目录，就是首页
    public String Hello(){//@RequestParam(name ="name" )String name, Model model

        return "index";

    }

}
