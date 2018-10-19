
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
    private String ModuleID;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<String> courses = new ArrayList<String>();
    
    public Module(String modName, String Id)
    {
        this.ModuleName = modName;
        this.ModuleID = Id;
        
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void addCourse(String Course)
    {
        courses.add(Course);
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    public ArrayList<String> getCourses()
    {
        return courses;
    }
    
    
    public String getName()
    {
        return ModuleName;
    }

}
