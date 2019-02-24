package com.yms.manager.DaoService;


import lombok.extern.slf4j.Slf4j;

/**
 * Created by lijinpeng on 2018/5/24.
 */
@Slf4j
public class YmsStockManagerService {
//    @Autowired
//    private StockManagerService stockManagerService;
//
//    /**
//     * 根据keyId 查询实体
//     *
//     * @param request    请求参数
//     * @param traceLogId 日志id
//     * @return
//     */
//    public ServiceResult findByKeyId(StockManagerRequest request, String traceLogId) {
//        log.info("调用数据仓储请求:{}", request);
//        DubboResult<StockManagerResponse> response = null;
//        try {
//            response = stockManagerService.StockDataBaseService(request, traceLogId);
//        } catch (Exception e) {
//            log.error("远程服务调用超时!!!");
//            return new ServiceResult(null, "SYS999990", "服务超时");
//        }
//        log.info("服务响应结果:{}", response);
//        if (response.isSuccess() == true) {
//            StockManagerResponse result = response.getResult();
//            if (request != null) {
//                return new ServiceResult(result.getResponseModel(), result.getResponseCode(), result.getResponseDesc());
//            } else {
//                log.error("远程服务调用，系统内部异常！");
//                return new ServiceResult(null, "SYS999999", "服务内部异常");
//            }
//        } else {
//            log.info("服务调用失败！！！");
//            return null;
//        }
//    }
}
