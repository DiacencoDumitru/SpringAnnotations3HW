package springcourse.practice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Can't seem to make you mine");
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
