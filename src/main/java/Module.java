
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
public class Module {
    private String ModuleName;
    private Long ModuleID;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;
    
    public Module(String modName, long Id)
    {
        this.ModuleName = modName;
        this.ModuleID = Id;
        
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void addCourse(CourseProgramme Course)
    {
        courses.add(Course);
    }
}
