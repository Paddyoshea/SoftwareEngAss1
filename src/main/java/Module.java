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
    private String[] students;
    private String[] courses;
    
    public Module(String modName, long Id, String[] students, String[] courses)
    {
        this.ModuleName = modName;
        this.ModuleID = Id;
        this.students = students;
        this.courses = courses;
    }
    
}
