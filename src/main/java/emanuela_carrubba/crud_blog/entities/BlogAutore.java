package emanuela_carrubba.crud_blog.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlogAutore {
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;

    public BlogAutore( Long id, String nome, String cognome, String email, String dataDiNascita, String avatar) {
        this.id = new Random().nextLong(1, 10000);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = LocalDate.parse(dataDiNascita);
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
    }
}
