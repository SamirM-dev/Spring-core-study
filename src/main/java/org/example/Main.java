package org.example;

import org.example.Classes.Computer;
import org.example.Classes.MusicPlayer;
import org.example.Classes.RaggyMusic;
import org.example.Enums.MusicGenre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer",Computer.class);
        computer.Start(MusicGenre.CLASSIC);

        context.close();

    }
}