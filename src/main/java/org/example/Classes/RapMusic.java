package org.example.Classes;

import org.example.Interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component public class RapMusic implements Music {
    private List<String> rapMusicList = new ArrayList<>(List.of("rap1","rap2","rap3"));
    @Override
    public List<String> getMusic() {
        return rapMusicList;
    }
}
