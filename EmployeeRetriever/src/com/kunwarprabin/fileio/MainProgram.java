/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio;

import com.kunwarprabin.fileio.controller.Controller;

/**
 *
 * @author OWNER
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Controller control = new Controller();
           control.addPost();
           control.addEmployee();
           control.showEmployeeRecords();
    }
    
}
