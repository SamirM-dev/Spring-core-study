package org.example.Classes.HomeworksFromAbstract;

import org.example.Interfaces.MessageService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class DevMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "DEV mode — тестовое окружение\n";
    }
}
