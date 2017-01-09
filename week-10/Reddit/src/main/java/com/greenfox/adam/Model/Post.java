package com.greenfox.adam.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */
@Entity(name = "t_reddit")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int score;
    private String content;

    public Post() {
    }

    public Post(int score, String content) {
        this.score = score;
        this.content = content;
    }

    public void plus(){
        score++;
    }

    public void minus(){
        score--;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
