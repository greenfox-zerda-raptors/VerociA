package com.greenfox.adam.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */

@Entity
@Table(name = "t_reddit")
public class Post {

    @javax.persistence.Id
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
        this.score++;
    }

    public void minus(){
        this.score--;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
