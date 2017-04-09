package com.study;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Max on 09.04.2017.
 */
@Component
public class UserService{

    @PostConstruct
    void initializeMethod(){
        System.out.println("I have been initialized");
    }

    @PreDestroy
    void destroyMethod(){
        System.out.println("I have been destroyed");
    }

}
