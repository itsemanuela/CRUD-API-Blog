package emanuela_carrubba.crud_blog.services;

import emanuela_carrubba.crud_blog.entities.BlogPost;
import emanuela_carrubba.crud_blog.exceptions.NotFoundId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
   private List<BlogPost> blogPosts = new ArrayList<BlogPost>();

   public List<BlogPost> findAll() {
      return blogPosts;
   }

   public BlogPost findById(long id) {
       for (BlogPost blogPost : blogPosts) {
           if (blogPost.getId() == id) {
               return blogPost;
           }
       }  throw new NotFoundId(id);
   }


    public BlogPost salvaPost(BlogPost nuovoPost) {
  this.blogPosts.add(nuovoPost);
  return nuovoPost;
    }

public BlogPost findByTitle(String title) {
       for (BlogPost blogPost : blogPosts) {
           if(blogPost.getTitolo().equals(title)) {
               return blogPost;
           }
       } throw new RuntimeException("Impossibile selezionare il post");
}

public BlogPost findByIdAndDelete(long id) {
        for (BlogPost blogPost : blogPosts) {
            if(blogPost.getId() == id) {
                blogPosts.remove(blogPost);
            }
        } throw new NotFoundId(id);
}

}
