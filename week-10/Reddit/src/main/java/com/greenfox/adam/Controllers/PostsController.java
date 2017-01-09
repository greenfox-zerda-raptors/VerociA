package com.greenfox.adam.Controllers;

import com.greenfox.adam.Model.Post;
import com.greenfox.adam.Services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */
@Controller
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts";
    }

    @RequestMapping(value = "/posts/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("posts", new Post());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPosts(@ModelAttribute Post post){
        repository.save(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/upvote")
    public String upVote(@PathVariable("id") int id) {
        Post post = repository.findOne(id);
        post.plus();
        repository.save(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/downvote")
    public String downVote(@PathVariable("id") int id) {
        Post post = repository.findOne(id);
        post.minus();
        repository.save(post);
        return "redirect:/posts";
    }

}
