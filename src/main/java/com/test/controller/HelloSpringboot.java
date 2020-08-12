package com.test.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author ssy
 * @Description HelloSpringboot
 * @Date 2020/8/12
 * @Version V1.00
 **/
@RestController
public class HelloSpringboot {
    @RequestMapping("/hello")
    public String say() {
        System.out.println("Hello springboot");
        return "hello,this is a springboot demo！~";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        String result= "username:"+username+",password:"+password;
        System.out.println(result);
        return(result);
    }
}
