package org.example.Classes;

import org.example.Interfaces.Music;

public class ClassicMusic implements Music {
    @Override
    public String getMusic() {
        return "Богемская рапсодия";
    }
}
