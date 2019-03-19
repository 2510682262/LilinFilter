package com.qfedu.lilinfilter;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class controller {

    @RequestMapping("/login.do")
    public String login(String uuid, HttpServletRequest request){

        HttpSession session = request.getSession ();
        session.setAttribute ("uuid",uuid);
        return "登录成功";
    }

    @RequestMapping("/test.do")
    public String test(){

        return "测试成功";
    }


}
