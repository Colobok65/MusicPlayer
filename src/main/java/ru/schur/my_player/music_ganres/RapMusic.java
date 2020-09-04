package ru.schur.my_player.music_ganres;

import java.util.ArrayList;
import java.util.List;


public class RapMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Track 1");
        list.add("Track 2");
        list.add("Track 3");

        return list;
    }
}
