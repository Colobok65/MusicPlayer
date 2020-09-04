package ru.schur.my_player.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.schur.my_player.MusicPlayer;
import ru.schur.my_player.MyComputer;
import ru.schur.my_player.music_ganres.ClassicalMusic;
import ru.schur.my_player.music_ganres.Music;
import ru.schur.my_player.music_ganres.RapMusic;
import ru.schur.my_player.music_ganres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rapMusic(), classicalMusic(), rockMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
    @Bean
    public MyComputer myComputer(){
        return new MyComputer(musicPlayer());
    }

}
