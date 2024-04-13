package Javabot.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Joke {
    @Id
    @GeneratedValue(generator = "joke_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "joke_id_seq", sequenceName = "joke_id_seq", allocationSize = 1)
    private int id;
    @Column(name = "popularity")
    private int popularity;
    private String text;
    public Joke() {
    }
    public Joke(String text) {
        this.text = text;
    }

}