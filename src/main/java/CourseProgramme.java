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
import org.joda.time.DateTime;
public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime Start;
    private DateTime end;
    
    public CourseProgramme(String name,  DateTime Start , DateTime end)
    {
        this.name = name;
        this.Start = Start;
        this.end = end;
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void addModule(Module module)
    {
        modules.add(module);
    }
}
