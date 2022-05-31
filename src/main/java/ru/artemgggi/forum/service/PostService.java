package ru.artemgggi.forum.service;

import org.springframework.stereotype.Service;
import ru.artemgggi.forum.model.Post;
import ru.artemgggi.forum.store.PostRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        return rsl;
    }
}
