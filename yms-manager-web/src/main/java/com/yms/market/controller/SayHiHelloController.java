/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2018 All Rights Reserved.
 */
package com.yms.market.controller;

import com.market.stock.enums.RequestType;
import com.market.stock.enums.TablesEnum;
import com.market.stock.model.DTO.User;
import com.market.stock.model.DemoModel;
import com.market.stock.model.StockManagerRequest;
import com.market.stock.model.StockManagerResponse;
import com.market.stock.service.PageShowService;
import com.market.stock.service.StockManagerService;
import com.market.stock.service.YmsStockManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;


/**
 * @author lijinpeng
 * @version Id: SayHiHelloController.java, v 0.1 2018/5/23 21:03 lijinpeng Exp $$
 */
@Slf4j
@Controller
public class SayHiHelloController {
    @Autowired
    private StockManagerService stockManagerService;
    @Autowired
    private PageShowService pageShowService;
    @Autowired
    private YmsStockManagerService ymsStockManagerService;

    @RequestMapping(value = "/start")
    @ResponseBody
    private String SayHi() {
        log.info("开始处理请求....");
        StockManagerRequest request = new StockManagerRequest();
        User user = new User();
        user.setUid(13);
        request.setDataModel(user);
        request.setRequestType(RequestType.SingleQuery);
        request.setTablesEnum(TablesEnum.USER_TABLE);
        StockManagerResponse response = stockManagerService.StockDataBaseService(request, UUID.randomUUID().toString());
        log.info("响应:{}", request);
        if (request.getDataModel() == null)
            return "fail";
        return response.getResponseModel().toString();
    }

    @RequestMapping(value = "/yms")
    @ResponseBody
    private String ymsSatHi() {
        log.info("开始处理请求....");
        StockManagerRequest request = new StockManagerRequest();
        User user = new User();
        user.setUid(13);
        request.setDataModel(user);
        request.setRequestType(RequestType.SingleQuery);
        request.setTablesEnum(TablesEnum.USER_TABLE);
        StockManagerResponse response = ymsStockManagerService.StockDataBaseService(request, UUID.randomUUID().toString());
        log.info("响应:{}", request);
        if (request.getDataModel() == null)
            return "fail";
        return response.getResponseModel().toString();
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    private String Saytest() {
        log.info("处理test请求");
        StockManagerRequest newRequest = new StockManagerRequest();
        User user = new User();
        user.setUid(13);
        newRequest.setDataModel(user);
        newRequest.setRequestType(RequestType.SingleQuery);
        newRequest.setTablesEnum(TablesEnum.USER_TABLE);
        log.info("请求model：{}",newRequest);

        StockManagerResponse stockManagerResponse = pageShowService.pay(newRequest);
        log.info("返回结果:{}", stockManagerResponse.toString());
        return stockManagerResponse.toString();
    }
}

