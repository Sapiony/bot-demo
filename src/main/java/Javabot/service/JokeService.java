package Javabot.service;
import Javabot.model.Joke;

import java.util.List;

public interface JokeService {
    List<Joke> getAllJokes();

    Joke getJokeById(int id);

    void createJoke(Joke joke);

    void updateJoke(int id, Joke updatedJoke);

    void deleteJoke(int id);

    Joke getRandomJoke();
}