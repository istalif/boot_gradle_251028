package com.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class DemoController {
    @ResponseBody
    @RequestMapping("/")
    public String home(){
        log.info("Boot Gradle!!");

        return "gradle";
    }

    @RequestMapping("/hello.do")
    public String hello(Model model){
<<<<<<< HEAD
        log.info("안녕하세요! 111 222 333 444 666");
=======
        log.info("안녕하세요! 111 222 333 444");
>>>>>>> e05b6b3d4ec7d628b5c8c5edc13801feda708c99
        model.addAttribute("message","hello.jsp 입니다!");
        //git config pull.rebase false

        return "hello";
    }
}
