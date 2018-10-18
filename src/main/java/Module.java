
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
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    
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
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    
    public String getName()
    {
        return ModuleName;
    }

}
