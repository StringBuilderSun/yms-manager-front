/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2018 All Rights Reserved.
 */
package com.yms.market.controller;

import com.market.stock.enums.RequestType;
import com.market.stock.enums.TablesEnum;
import com.market.stock.model.StockManagerRequest;
import com.market.stock.model.StockManagerResponse;
import com.market.stock.service.StockManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author lijinpeng
 * @version Id: SayHiHelloController.java, v 0.1 2018/5/23 21:03 lijinpeng Exp $$
 */
@Controller
public class SayHiHelloController {

    @RequestMapping(value = "/start")
    @ResponseBody
    private void  SayHi()
    {

    }
}

