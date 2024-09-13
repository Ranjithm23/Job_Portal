package com.Ganesh.JobPortal.Controller;

import com.Ganesh.JobPortal.Model.Post;
import com.Ganesh.JobPortal.Repo.PostRepositary;
import com.Ganesh.JobPortal.Repo.SearchRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    SearchRepositary srepo;
    @Autowired
    PostRepositary repo;


//    @RequestMapping(value="/")
//    public void redirect(HttpServletResponse response) throws IOException {
//        response.sendRedirect("/swagger-ui.html");
//    }
@GetMapping("/allposts")
@CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
@GetMapping("/posts/{text}")
@CrossOrigin
    public List<Post>search(@PathVariable String text){
    return srepo.findByText(text);
    }


    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
            return repo.save(post);
    }

}
