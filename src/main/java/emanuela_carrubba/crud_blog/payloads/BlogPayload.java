package emanuela_carrubba.crud_blog.payloads;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPayload {

    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;



}