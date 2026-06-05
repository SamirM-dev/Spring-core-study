package org.example.Classes;

import org.example.Enums.MusicGenre;
import org.example.Interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String musicPlayerName;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList=new ArrayList<>();
    Random random=new Random();
    private Music music;
    public MusicPlayer(List<Music> musicList){
        this.musicList=musicList;
    }

    public String playMusic(){
        music=musicList.get(random.nextInt(musicList.size()));
        return music.getMusic().get(random.nextInt(music.getMusic().size()));
    }

    public String getMusicPlayerName() {
        return musicPlayerName;
    }

    public int getVolume() {
        return volume;
    }
}
