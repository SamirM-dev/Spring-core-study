package org.example.Classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public RaggyMusic raggyMusic(){
        return new RaggyMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(List.of(classicMusic(),rapMusic(),raggyMusic()));
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }



}
