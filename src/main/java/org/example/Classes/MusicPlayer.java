package org.example.Classes;

import org.example.Interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String playerName;
    private int volume;
    private Music music;
    private List<Music> musicList=new ArrayList<>();
    public MusicPlayer(){}
    public MusicPlayer(Music music){
        this.music=music;
    }
    public MusicPlayer(List<Music> musicList){this.musicList=musicList;}

        public void setMusic(Music music) {
        this.music = music;
    }

//    public void playSingleMusic(){
//        System.out.println("Играет: "+music.getMusic());
//    }
//    public void playMusicList()throws Exception{
//        System.out.println("Запускается музыкальный плеер...");
//        for (Music m:musicList){
//            System.out.println("Играет: "+m.getMusic());
//            Thread.sleep(1000);
//        }
//        System.out.println("Вся музыка проиграна.");
//    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
