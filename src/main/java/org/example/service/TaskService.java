package org.example.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    public String createTask(String title){
        System.out.println("TaskService: создаю задачу — " + title);
        return "Задача создана: " + title;

    }
    public void deleteTask(int id){
        if (id<0) throw  new IllegalArgumentException("ERROR id "+id+" is not exist");
        System.out.println("TaskService: удаляю задачу " + id);

    }
    public List<String> getAllTasks(){
        System.out.println("TaskService: получаю все задачи");
        return List.of("Задача 1", "Задача 2");

    }

}
