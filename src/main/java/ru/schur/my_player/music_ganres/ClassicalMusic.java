package ru.schur.my_player.music_ganres;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Sonata 1");
        list.add("Sonata 2");
        list.add("Sonata 3");

        return list;
    }
}
