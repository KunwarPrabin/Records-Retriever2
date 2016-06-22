/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.entity;

/**
 *
 * @author OWNER
 */
public class Post {
    private int id;
    private String post;

    public Post() {
    }

    public Post(int id, String post) {
        this.id = id;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    
}
