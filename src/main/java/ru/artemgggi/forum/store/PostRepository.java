package ru.artemgggi.forum.store;

import org.springframework.data.repository.CrudRepository;
import ru.artemgggi.forum.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> { }
