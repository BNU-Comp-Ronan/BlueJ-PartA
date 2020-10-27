import java.util.*;
/**
 * This class hold the course details.
 *
 * @author Ronan DeMelo
 * @version 26/10/2020
 */
public class Course
{
    // The ID of the course.
    private String codenumber;
    //The Name of the course
    private String title;
    
    //Allows us to use the data from the Module class.
    private ArrayList<Module> modules;
    
    //Gets information from the Module class.
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course.
     */
    public Course(String courseName, String courseID)
    {
        
        codenumber = courseID;
        
        title = courseName;
        
        modules =  new ArrayList<Module>();
        
        // creates the modules
        createModules();
    }
    
    /**
     * Hold the informaton on each module.
     */
    private void createModules()
    {
        module1 = new Module("Programming", "C1", 25);
        module2 = new Module("Design", "C2", 25);
        module3 = new Module("3D", "C3", 25);
        module4 = new Module("Computing", "C4", 25);
    }
    
    /**
     * This will allow you to add modules to the course.
     */
    public void enrolModules(Module newModules)
    {
        if(modules.size() == 4)
        {
            System.out.println("The Course has the maximum amount of Modules.");
        }
        else
        {
            modules.add(newModules);
        }
    }
    
    
    /**
     * Prints out all the course information.
     */
    public void printCourseDetails()
    {
        System.out.println("Course Name:" + title + ", Course ID:" + codenumber);
        System.out.println("Module: " + module1.title + ", Module Code: " + module1.moduleCode);
        System.out.println("Module: " + module2.title + ", Module Code: " + module2.moduleCode);
        System.out.println("Module: " + module3.title + ", Module Code: " + module3.moduleCode);
        System.out.println("Module: " + module4.title + ", Module Code: " + module4.moduleCode);
    }

    /**
     * Prints out the course names and IDs.
     */
    public void print()
    {
        System.out.println("Course Name:" + title + ", Course ID:" + codenumber);
    }
}

