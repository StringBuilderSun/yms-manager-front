package com.yms.manager.DaoService;

import com.market.stock.enums.ResultStatusEnum;
import com.market.stock.model.StockManagerRequest;
import com.market.stock.model.StockManagerResponse;
import com.market.stock.service.StockManagerService;
import com.yms.utils.dubbo.DubboResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijinpeng on 2018/5/24.
 */
@Service
@Slf4j
public class YmsStockManagerService {
    @Autowired
    private StockManagerService stockManagerService;

    /**
     * 根据keyId 查询实体
     *
     * @param request    请求参数
     * @param traceLogId 日志id
     * @param <T>
     * @return
     */
    public <T> T findByKeyId(StockManagerRequest request, String traceLogId) {
        log.info("调用数据仓储请求:{}", request);
        DubboResult<StockManagerResponse> response = stockManagerService.StockDataBaseService(request, traceLogId);
        if (response.isSuccess() == true) {
            log.info("服务响应码:{},服务响应描述:{},服务响应结果:{}", response.getErrorCode(), response.getErrorDesc(), response.getResult());
            return (T) response.getResult();
        } else {
            log.info("服务调用失败！！！");
            return null;
        }
    }
}
