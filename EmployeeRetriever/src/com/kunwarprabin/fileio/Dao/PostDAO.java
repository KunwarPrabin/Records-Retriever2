/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.Dao;

import com.kunwarprabin.fileio.entity.Post;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface PostDAO {
    boolean add(Post p);
    ArrayList<Post> showAll();
         
}
