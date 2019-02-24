package com.yms.market.controller;

import com.alibaba.dubbo.common.json.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by lijinpeng on 2018/5/25.
 */
@Controller
@Slf4j
public class UserController {

//    @Autowired
//    private YmsStockManagerService ymsStockManagerService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String uid) {
        return uid + "-云梦丝-登录成功！";
    }
}
