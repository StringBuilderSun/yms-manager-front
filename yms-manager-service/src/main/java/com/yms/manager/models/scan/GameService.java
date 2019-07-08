package com.yms.manager.models.scan;

import com.yms.manager.models.Person;
import com.yms.manager.models.scan.impl.Boss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: lijinpeng
 * Created by Shanghai on 2019/4/8.
 */
@Component(value = "gameService")
@Slf4j
public class GameService extends Boss {

    @Autowired
    public Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void playGames() {
        log.info("person-name:{} play games", person.getName());
//        throw new Exception("test exception");
    }
}
