package org.example.Classes;

import org.example.Enums.MusicGenre;
import org.example.Interfaces.Music;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RaggyMusic implements Music {
    private List<String> raggyMusicList = new ArrayList<>(List.of("raggy1","raggy2","raggy3"));
    public void Init(){
        System.out.println("Miyagi coming...");
    }
    public void Dest(){
        System.out.println("Miyagi go out!");
    }
    @Override
    public List<String> getMusic() {
        return raggyMusicList;
    }
}
