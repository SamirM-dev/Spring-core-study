package org.example.Classes;

import org.example.Enums.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        id=1;
        this.musicPlayer=musicPlayer;
    }

    public void Start(){
        System.out.println("Computer["+id+"] playing : "+musicPlayer.playMusic());
    }

}
