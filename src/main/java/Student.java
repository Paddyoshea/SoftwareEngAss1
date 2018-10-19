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
import org.joda.time.LocalDate;



public class Student {
    
    private String name;
    private int age;
    private LocalDate DOB;
    private long ID;
    private String userName;
    private String course; 
    private ArrayList<String> modules = new ArrayList<String>();
    
    
    
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
    
    public String getCourses()
    {
        return course;
    }
    
    public String[] getModule()
    {
        String CurrModules[];
        for(int i = 0; i<modules.size();i++)
        {
            CurrModules[i] = modules.get(i);
        }
        return CurrModules;
    }
    
    public void addCourse(String name)
    {
        this.course = name;
    }
    
    public void addModule(String name)
    {
        modules.add(name);
    }
    
    
}
