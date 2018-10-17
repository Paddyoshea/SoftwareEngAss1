/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.joda.time.LocalDate;
/**
 *
 * @author Paddy
 */
public class NewClass {
    
    public static void main(String[] args){
        
        Student paddy = new Student( "paddy" , 20, "96-09-10");
        Student mark = new Student("mark", 20, "97-07-10");
        
        System.out.print(paddy.getUserName());
        System.out.print(mark.getUserName());
        
        Module physics = new Module("physics", 1234);
        
        physics.addStudent(paddy);
        //physics.addStudent(mark);
        
        //System.out.print(physics.getStudents());
        
        
        
    }
    
}
