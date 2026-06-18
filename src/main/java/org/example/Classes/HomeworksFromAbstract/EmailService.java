package org.example.Classes.HomeworksFromAbstract;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class EmailService {
    @EventListener
    public void messageForRegisteredUsers(UserRegisteredEvent userRegisteredEvent){
        System.out.println("Отправляем письмо пользователю: "+userRegisteredEvent.getUsername());
    }
}
