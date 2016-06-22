/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.Dao;

import com.kunwarprabin.fileio.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface EmployeeDAO {
    
    boolean add(Employee e);
    ArrayList<Employee> showAll();
    
}
