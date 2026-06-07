package org.example.Classes.HomeworksFromAbstract;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component public class SpelConfig {
    @Value("#{appSettings.appMaxUsers*2}") private int doubleMaxCount;
    @Value("#{appSettings.appName.toUpperCase}") private String appNameUpperCase;

    @PostConstruct public void print(){
        System.out.println("=== Бин использующий SpEL ===");
        System.out.println("Расширенный лимит: "+doubleMaxCount);
        System.out.println("Имя upper: "+appNameUpperCase);
        System.out.println();
    }
}
