/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
import java.util.ArrayList;
import org.joda.time.LocalDate;
public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students= new ArrayList<Student>();
    private LocalDate Start;
    private LocalDate end;
    
    public CourseProgramme(String name,  String Start , String end)
    {
        this.name = name;
        this.Start = LocalDate.parse(Start);
        this.end = LocalDate.parse(end);
    }
    
    public void CoursePrograme()
    {
        
    }
    
    public void addStudent(Student student)
    {
        student.addCourse(name);
        students.add(student);
    }
    public String getName()
    {
        return name;
    }
    public void addModule(Module module)
    {
        module.addCourse(name);
        modules.add(module);
    }
    public String[] getModule()
    {
        String CurrModules[] = new String[modules.size()];
        for(int i=0;i<modules.size();i++)
        {
            CurrModules[i] = modules.get(i).getName();
        }
        return CurrModules;
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    

}
