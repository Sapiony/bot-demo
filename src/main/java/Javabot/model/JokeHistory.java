package Javabot.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class JokeHistory {
    @Id
    @GeneratedValue(generator = "jokeh_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "jokeh_id_seq", sequenceName = "jokeh_id_seq", allocationSize = 1)
    private Long id;

    private LocalDateTime callTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "joke_id")
    private Joke joke;

}
