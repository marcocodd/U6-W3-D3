package marco.U5W3D3.services;

import marco.U5W3D3.entities.BlogPost;
import marco.U5W3D3.exceptions.NotFoundException;
import marco.U5W3D3.repositories.BlogPostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostDAO blogPostDAO;
    @Autowired
    private AutoreService autoreService;


    public BlogPost save(BlogPost newBlogPost) {
        newBlogPost.setCover(" ");
        return blogPostDAO.save(newBlogPost);
    }

    public BlogPost findById(Long id) {
        return this.blogPostDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}

