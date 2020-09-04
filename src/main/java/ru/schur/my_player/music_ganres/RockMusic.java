package ru.schur.my_player.music_ganres;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Song 1");
        list.add("Song 2");
        list.add("Song 3");

        return list;
    }
}
