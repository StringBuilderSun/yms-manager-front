package com.yms.manager.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lijinpeng on 2019/4/8.
 */

@Component(value = "userService")
public class UserService {
    @Autowired
    private Person person;

}
