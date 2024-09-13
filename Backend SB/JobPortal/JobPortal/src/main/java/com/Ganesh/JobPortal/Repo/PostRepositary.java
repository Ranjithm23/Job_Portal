package com.Ganesh.JobPortal.Repo;


import com.Ganesh.JobPortal.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PostRepositary extends MongoRepository<Post,String> {
}
