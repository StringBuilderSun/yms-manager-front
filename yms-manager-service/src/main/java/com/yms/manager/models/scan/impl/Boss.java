package com.yms.manager.models.scan.impl;


import com.yms.manager.models.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lijinpeng on 2019/4/9.
 */
@Component(value = "boss")
public class Boss {
    @Autowired
    private BeanService beanService;
    public BeanService getBeanService()
    {
        return beanService;
    }
}
