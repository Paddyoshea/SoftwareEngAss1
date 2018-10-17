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
import java.text.*;
import org.joda.time.LocalDate;



public class Student {
    
    private String name;
    private int age;
    private LocalDate DOB;
    private long ID;
    private String userName;
    private ArrayList<String> courses;
    private ArrayList<String> modules;
    
    
    
    public Student(String name , int age, String DOB)
    {
        this.name = name;
        this.age = age;
        this.DOB = LocalDate.parse(DOB);
     
        userName = name + String.valueOf(age);
        
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
    
    public ArrayList<String> getCourses()
    {
        return courses;
    }
    
    public ArrayList<String> getModule()
    {
        return modules;
    }
    
    public void addCourse(String name)
    {
        courses.add(name);
    }
    
    public void addModule(String name)
    {
        courses.add(name);
    }
    
    
}
