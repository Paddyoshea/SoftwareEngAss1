/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paddy
 */
public class StudentTestUnitTest {
    
    public StudentTestUnitTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void StudentTest()
    {
        Student paddy = new Student( "paddy" , 20, "96-09-10");
        Student mark = new Student("mark", 20, "97-07-10");
        Module physics = new Module("physics", 1234);
        Module maths = new Module("maths", 1234);
        CourseProgramme course = new CourseProgramme("EE123", "19-10-10","20-10-10");
        paddy.addModule(physics.getName());
        paddy.addModule(maths.getName());
        paddy.getModule();
        paddy.addCourse("EE123");
        ArrayList<String> module = new ArrayList<String>(); 
        module.add("physics");
        module.add("maths");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(paddy);
        students.add(mark);
        course.addStudent(paddy);
        course.addStudent(mark);
        physics.addStudent(paddy);
        physics.addStudent(mark);
        
        assertEquals("paddy20",paddy.getUserName());
        assertEquals("EE123",paddy.getCourses());
        assertEquals(module ,paddy.getModule());
        assertEquals(students ,course.getStudents());
        assertEquals(students ,physics.getStudents());
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
