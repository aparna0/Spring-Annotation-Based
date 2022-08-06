package com.aparna.Employee_System;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Department dept = (Department)context.getBean("department");
        dept.setId(1);
        dept.setName("development");
        
        Employee emp = (Employee)context.getBean("employee");
        emp.setDpt(dept);
        emp.setEmpId(12345);
        emp.setEmpName("Aparna");
        
        System.out.println(emp);
    }
}
