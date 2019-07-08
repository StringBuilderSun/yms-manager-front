package com.yms.manager.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by Administrator on 2019/3/29.
 */
@Getter
@Setter
@Slf4j
public class BeanService implements BeanFactoryAware {
    private UserDao mapper;
    private String name;
    private boolean sex;
    public void playGames() {
        log.info("person-name:nobody play games");
    }

    public void init()
    {
        System.out.println("执行初始化方法!");
    }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("获取到了beanFactroy:"+beanFactory);
    }
}
