package com.test.controller;
import com.test.util.ResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author ssy
 * @Description HelloSpringboot
 * @Date 2020/8/12
 * @Version V1.00
 **/
@RestController
public class HelloSpringboot {

    private static final Logger logger  =  LoggerFactory.getLogger(HelloSpringboot.class );

    @RequestMapping("/hello")
    public String say() {
        logger.info("我是sad={}","asdsa");
        System.out.println("Hello springboot");
        logger.debug("Processing trade with id: {} and symbol : {} ", 11, 22);

        logger.info("我是11sad={}","asdsa");
        logger.info("我是1324sad={}","asdsa");
        logger.info("我是342sad={}","asdsa");
        try {
            
            int [] str = new int[2];
            System.out.println(str[5]);
        }catch (Exception e){
            logger.error("2020-08-24 16:39:16.521 异常信息：{} {}",e.getStackTrace(),"2020-08-24 16:32:54.542");
        }

        return "hello,this is a springboot demo！~";
    }
    @RequestMapping("/test")
    public void  say11() {
        throw new RuntimeException("ExceptionTest");
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        String result= "username:"+username+",password:"+password;
        System.out.println(result);
        return(result);
    }


}
