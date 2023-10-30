package com.lkk.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description //TODO
 * @Author lkk
 * Date 2023/10/30/16:46
 * @Version 1.0
 **/
@RestController("test")
public class TestController {


    @PostMapping("/filter")
    public void sayHello(){
        System.out.println("hello word");
    }
}
