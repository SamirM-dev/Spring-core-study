package org.example.Classes;

import org.example.Enums.MusicGenre;
import org.example.Interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component public class MusicPlayer {
    private Music raggy;
    private Music classic;
    @Autowired
    public MusicPlayer(@Qualifier("raggyMusic") Music raggy, @Qualifier("classicMusic") Music classic){
        this.raggy=raggy;
        this.classic=classic;
    }

    public String playMusic(MusicGenre musicGenre){
        Random random = new Random();
        if (musicGenre==MusicGenre.CLASSIC) {
            return classic.getMusic().get(random.nextInt(3));
        }
        else{
            return raggy.getMusic().get(random.nextInt(3));
        }
    }
}
