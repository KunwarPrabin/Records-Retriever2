/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.impl;

import com.kunwarprabin.fileio.Dao.EmployeeDAO;
import com.kunwarprabin.fileio.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    ArrayList<Employee> employeelist = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        return employeelist.add(e);
    }

    @Override
    public ArrayList<Employee> showAll() {
        return employeelist;
    }

}
