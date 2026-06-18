package org.example.Classes.HomeworksFromAbstract;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.time.Clock;

public class UserRegisteredEvent extends ApplicationEvent {
    private final String username;
    public UserRegisteredEvent(Object source,String username){
        super(source);
        this.username=username;
    }

    public String getUsername() {
        return username;
    }
}
