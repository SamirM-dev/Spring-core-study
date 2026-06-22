package org.example.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicee {
    public String createUser(String name){
        System.out.println("UserServicee: создаю пользователя — " + name);
        return "Задача создана: " + name;

    }
    public void deleteUser(int id){
        if (id<0) throw  new IllegalArgumentException("ERROR id "+id+" is not exist");
        System.out.println("UserServicee: удаляю польхователя " + id);

    }
    public List<String> getAllUsers(){
        System.out.println("UserServicee: получаю всех пользователей");
        return List.of("Пользователь 1", "Пользователь 2");

    }
}
