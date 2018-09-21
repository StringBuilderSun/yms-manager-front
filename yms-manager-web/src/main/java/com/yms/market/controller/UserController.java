package com.yms.market.controller;

import com.market.stock.enums.RequestType;
import com.market.stock.enums.TablesEnum;
import com.market.stock.model.DTO.User;
import com.market.stock.model.StockManagerRequest;
import com.yms.manager.DaoService.YmsStockManagerService;
import com.yms.utils.log.AlivnMarker;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * Created by lijinpeng on 2018/5/25.
 */
@Controller
@Slf4j
public class UserController {


    @RequestMapping("/")
    public String login() {
        System.out.println("跳转拉...");
        return "index";
    }
}
