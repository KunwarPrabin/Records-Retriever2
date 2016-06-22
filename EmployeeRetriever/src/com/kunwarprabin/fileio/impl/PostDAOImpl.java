/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.impl;

import com.kunwarprabin.fileio.Dao.PostDAO;
import com.kunwarprabin.fileio.entity.Post;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class PostDAOImpl implements PostDAO {

    ArrayList<Post> postlist = new ArrayList<>();

    @Override
    public boolean add(Post p) {
        return postlist.add(p);
    }

    @Override
    public ArrayList<Post> showAll() {
        return postlist;
    }
    
}
