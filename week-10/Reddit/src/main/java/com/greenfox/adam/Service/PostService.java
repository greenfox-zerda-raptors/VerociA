package com.greenfox.adam.Service;

import com.greenfox.adam.Domain.Post;
import com.greenfox.adam.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Verőci Ádám on 2017.01.10..
 */
@Service
public class PostService {
    PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> getAllPosts() {
        return (List<Post>) repository.findAllByOrderByScoreDesc();
    }

    public void savePost(Post post) {
        repository.save(post);
    }

    public void upVotePost(int id) {
        Post post = repository.findOne(id);
        post.plus();
        repository.save(post);
    }

    public void downVotePost(int id) {
        Post post = repository.findOne(id);
        post.minus();
        repository.save(post);
    }

    public Post getPostForArticle(int id){
        Post post = repository.findOne(id);
        return post;
    }

}
