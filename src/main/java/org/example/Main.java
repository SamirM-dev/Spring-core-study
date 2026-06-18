package org.example;

import org.example.Classes.Computer;
import org.example.Classes.HomeworksFromAbstract.AppSettings;
import org.example.Classes.HomeworksFromAbstract.ClassWithEnvironment;
import org.example.Classes.HomeworksFromAbstract.ConfigurationClass;
import org.example.Classes.HomeworksFromAbstract.UserService;
import org.example.Classes.MusicPlayer;
import org.example.Classes.RaggyMusic;
import org.example.Classes.SpringConfig;
import org.example.Enums.MusicGenre;
import org.example.Interfaces.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        context.getBean("userService", UserService.class).userRegister("Samir");

    }
}