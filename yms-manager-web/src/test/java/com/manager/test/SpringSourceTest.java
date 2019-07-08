package com.manager.test;

import com.yms.manager.models.BeanService;
import com.yms.manager.models.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lijinpeng on 2019/5/13.
 */
public class SpringSourceTest {
    @Test
    public void testSpringLoad() {
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("spring/spring-context.xml");
        Person person = (Person) application.getBean("person");
        BeanService beanService = (BeanService) application.getBean("beanService");
        System.out.println(beanService);
        System.out.println(person);
    }
}
