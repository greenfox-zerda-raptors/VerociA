package com.greenfox.adam.Controllers;

import com.greenfox.adam.Domain.Post;
import com.greenfox.adam.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */
@Controller
public class PostsController {


    private PostService service;

    @Autowired
    public PostsController(PostService service) {
        this.service = service;
    }

    @GetMapping(value = "/posts")
    public String index(Model model){
        model.addAttribute("posts", service.getAllPosts());
        return "posts";
    }

    @GetMapping(value = "/posts/add")
    public String add(Model model){
        model.addAttribute("post", new Post());
        return "add";
    }

    @PostMapping(value = "/posts/add")
    public String addPosts(@ModelAttribute Post post){
        service.savePost(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/posts/{id}/upVote")
    public String upVote(@PathVariable("id") int id) {
        service.upVotePost(id);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/posts/{id}/downVote")
    public String downVote(@PathVariable("id") int id) {
        service.downVotePost(id);
        return "redirect:/posts";
    }
}
