package org.example.Classes.HomeworksFromAbstract;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

public class ClassWithEnvironment {
    private final Environment environment;

    public ClassWithEnvironment(Environment environment) {
        this.environment = environment;
    }
    public String checking(String keyName){
        if (environment.containsProperty(keyName)) return environment.getProperty(keyName);
        else return "Ключ не найден";
    }
}
