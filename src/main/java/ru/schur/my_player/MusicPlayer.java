package ru.schur.my_player;

import ru.schur.my_player.music_ganres.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        Random random = new Random();
        int randomList = random.nextInt(3);
        int randomSong = random.nextInt(3);
        Music music = musicList.get(randomList);
        return music.getSong().get(randomSong);
    }
}
