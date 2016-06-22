/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.controller;

import com.kunwarprabin.fileio.Dao.EmployeeDAO;
import com.kunwarprabin.fileio.Dao.PostDAO;
import com.kunwarprabin.fileio.entity.Employee;
import com.kunwarprabin.fileio.entity.Post;
import com.kunwarprabin.fileio.impl.EmployeeDAOImpl;
import com.kunwarprabin.fileio.impl.PostDAOImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author OWNER
 */
public class Controller {

    EmployeeDAO empDAO = new EmployeeDAOImpl();
    PostDAO postDAO = new PostDAOImpl();

    public void addPost() {

        try {
            BufferedReader buffreader1 = new BufferedReader(new FileReader("E:\\GITHUB\\EmployeeRetriever\\src\\DATA\\post.txt"));
            String line1 = "";
            while ((line1 = buffreader1.readLine()) != null) {
                String[] token1 = line1.split(",");
                Post post = new Post();
                post.setId(Integer.parseInt(token1[0]));
                post.setPost(token1[1]);
                postDAO.add(post);

            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void addEmployee() {
        try {
            BufferedReader buffreader2 = new BufferedReader(new FileReader("E:\\GITHUB\\EmployeeRetriever\\src\\DATA\\employee.txt"));
            String line2 = "";
            while ((line2 = buffreader2.readLine()) != null) {
                String[] token2 = line2.split(",");
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(token2[0]));
                employee.setFirstName(token2[1]);
                employee.setLastName(token2[2]);
               for(Post p:postDAO.showAll()){
                   if(Integer.parseInt(token2[3])==p.getId()){
                       employee.setPost(p.getPost());
                   }
               }empDAO.add(employee);
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    
    public void showEmployeeRecords(){
        for(Employee eRecords:empDAO.showAll()){
            System.out.println("ID:"+eRecords.getId());
            System.out.println("First Name:"+eRecords.getFirstName());
            System.out.println("last Name:"+eRecords.getLastName());
            System.out.println("Post:"+eRecords.getPost());
            System.out.println("*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*~~~~~*");
        }
    }

}
