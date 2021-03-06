package com.greenfox.adam.Repository;

import com.greenfox.adam.Domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */
public interface PostRepository extends CrudRepository <Post, Integer> {

    List<Post> findAllByOrderByScoreDesc();
}
