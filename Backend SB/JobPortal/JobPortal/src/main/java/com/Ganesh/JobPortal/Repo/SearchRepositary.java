package com.Ganesh.JobPortal.Repo;

import com.Ganesh.JobPortal.Model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepositary {


   List<Post> findByText(String text);
}
