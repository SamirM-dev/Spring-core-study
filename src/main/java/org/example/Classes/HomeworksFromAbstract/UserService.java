package org.example.Classes.HomeworksFromAbstract;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class UserService {
    private  final ApplicationEventPublisher applicationEventPublisher;
    public UserService(ApplicationEventPublisher applicationEventPublisher){
        this.applicationEventPublisher=applicationEventPublisher;
    }
    public void userRegister(String username){
        System.out.println("User \""+username+"\" was saved");
        applicationEventPublisher.publishEvent(new UserRegisteredEvent(this,username));
    }
}
