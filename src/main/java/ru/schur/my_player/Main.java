package ru.schur.my_player;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.schur.my_player.config.SpringConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MyComputer myComputer = context.getBean("myComputer", MyComputer.class);
        System.out.println(myComputer);

    }
}
