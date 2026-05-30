package org.example.Classes;

import org.example.Interfaces.Music;

public class ReggyMusic implements Music {
    public void Init(){
        System.out.println("Miyagi coming...");
    }
    public void Dest(){
        System.out.println("Miyagi go out!");
    }
    @Override
    public String getMusic() {
        return "Bounty";
    }
}
