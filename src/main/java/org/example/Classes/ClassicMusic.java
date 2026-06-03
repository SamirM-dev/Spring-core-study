package org.example.Classes;

import org.example.Interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component public class ClassicMusic implements Music {
    private List<String> classicMusicList = new ArrayList<>(List.of("classic1","classic2","classic3"));
    @Override
    public List<String> getMusic() {
        return classicMusicList;
    }
}
