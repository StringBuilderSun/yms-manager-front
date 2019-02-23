package com.yms.market.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.market.stock.enums.RequestType;
import com.market.stock.enums.TablesEnum;
import com.market.stock.model.DTO.User;
import com.market.stock.model.StockManagerRequest;
import com.yms.manager.DaoService.YmsStockManagerService;
import com.yms.manager.model.ServiceResult;
import com.yms.utils.log.AlivnMarker;
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
        String traceLogId = UUID.randomUUID().toString();
        MDC.put(AlivnMarker.TRACE_LOG_ID, traceLogId);
        log.info("用户请求登陆，用户id:{}", uid);
        StockManagerRequest request = new StockManagerRequest();
        request.setRequestType(RequestType.SingleQuery);
        request.setTablesEnum(TablesEnum.USER_TABLE);
        User user = new User();
        user.setUid(Integer.parseInt(uid));
        request.setDataModel(user);
        User user00=new User();
        user00.setUname("lijinpeng");
        user00.setSex(false);
        user00.setPhone("1893573846");
        user00.setCity("河南郑州");
        ServiceResult<User> result = new ServiceResult<User>(user00);//ymsStockManagerService.findByKeyId(request, traceLogId);
        if (result.getResult() != null) {
            log.info("用户登陆成功！{}", result.getResult());
            String jsonString = null;
            try {
                jsonString = JSON.json(result.getResult());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonString;
        } else {
            log.info("响应码:{},响应描述:{}", result.getRspCode(), result.getRspMsg());
            return result.toString();
        }
    }
}
