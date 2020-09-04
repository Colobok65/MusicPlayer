package ru.schur.my_player;

public class MyComputer {
    private MusicPlayer musicPlayer;

    public MyComputer() {}

    public MyComputer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic();
    }
}
