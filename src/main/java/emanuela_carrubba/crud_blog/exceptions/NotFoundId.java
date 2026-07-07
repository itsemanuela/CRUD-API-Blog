package emanuela_carrubba.crud_blog.exceptions;

public class NotFoundId extends RuntimeException {
    public NotFoundId(Long id) {
        super("Il blog con id" + id + "non è stato trovato");
    }
}
