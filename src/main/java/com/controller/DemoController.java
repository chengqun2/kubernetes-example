package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getIp")
    public String getIp(HttpServletRequest request) {
        // 取得服务器IP、端口
        return request.getLocalAddr() + ":" + request.getLocalPort();
    }
}
