package emanuela_carrubba.crud_blog.entities;


import lombok.*;

import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class BlogPost {
    private long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPost(Long id, String categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {
        this.id = new Random().nextLong(1, 10000);
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.cover = "https://picsum.photos/200/300?random=" + this.id;
    }


}
