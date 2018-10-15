/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
import java.util.*;
import org.joda.time.DateTime;


public class Student {
    
    private String name;
    private int age;
    private DateTime DOB;
    private long ID;
    private String userName;
    private String[] courses;
    private String[] modules;
    
    public Student(String name , int age, DateTime DOB, String[] courses, String[] modules)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        userName = name + String.valueOf(age);
        this.courses = courses;
        this.modules = modules;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public long getID()
    {
        return ID;
    }
    
    
}
