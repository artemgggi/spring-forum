package ru.artemgggi.forum.service;

import org.springframework.stereotype.Service;
import ru.artemgggi.forum.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(Post.of("продам гараж"));
        posts.add(Post.of("куплю кота"));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
