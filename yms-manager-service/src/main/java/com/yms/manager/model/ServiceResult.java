package com.yms.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Administrator on 2018/5/26.
 */
@Setter
@Getter
@ToString
public class ServiceResult<T> extends Base {
    private String rspCode;
    private String rspMsg;
    private T result;

    public ServiceResult(T result) {
        this.result = result;
    }

    public ServiceResult(String rspCode, String rspMsg) {
        this.rspCode = rspCode;
        this.rspMsg = rspMsg;
    }

    public ServiceResult(T result, String rspCode, String rspMsg) {
        this.rspCode = rspCode;
        this.rspMsg = rspMsg;
        this.result = result;
    }
}
