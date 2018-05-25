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
    @Autowired
    private YmsStockManagerService ymsStockManagerService;

    @RequestMapping("login/uid")
    public String login(@PathVariable String uid) {
        String traceLogId = UUID.randomUUID().toString();
        MDC.put(AlivnMarker.TRACE_LOG_ID, traceLogId);
        log.info("用户请求登陆，用户id:{}", uid);
        StockManagerRequest request = new StockManagerRequest();
        request.setRequestType(RequestType.SingleQuery);
        request.setTablesEnum(TablesEnum.USER_TABLE);
        User user = new User();
        user.setUid(Integer.parseInt(uid));
        request.setDataModel(user);
        Object result = ymsStockManagerService.findByKeyId(request, traceLogId);
        if (request != null) {
            user = (User) result;
            log.info("用户登陆成功！");
            return user.toString();
        } else {
            log.info("用户登陆失败！！！");
            return "用户登陆失败！！！";
        }
    }
}
