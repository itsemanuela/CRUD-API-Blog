package emanuela_carrubba.crud_blog.controllers;


import emanuela_carrubba.crud_blog.entities.BlogPost;
import emanuela_carrubba.crud_blog.payloads.BlogPayload;
import emanuela_carrubba.crud_blog.services.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    //iniettare dipendenze
    private final BlogService blogService;
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<BlogPost> findAll() {
        return this.blogService.findAll();

    }

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public BlogPost creaPost(@RequestBody BlogPayload blogPayload) {
BlogPost newPost = new BlogPost();
newPost.setTitolo(blogPayload.getTitolo());
newPost.setCategoria(blogPayload.getCategoria());
newPost.setContenuto(blogPayload.getContenuto());
newPost.setTempoDiLettura(blogPayload.getTempoDiLettura());

return this.blogService.salvaPost(newPost);
}

}
