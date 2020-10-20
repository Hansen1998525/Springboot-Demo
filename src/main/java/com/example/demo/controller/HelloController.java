package com.example.demo.controller;

import com.example.demo.service.HelloService;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Hansen.Qu
 */
@RestController
@RequestMapping(value = "test")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping(value = "hello")
    public int Hello() {
        System.out.println("test-----------------test");
        return helloService.getId();
    }
}
