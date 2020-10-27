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
    
    /**
     * Constructor for objects of class Course.
     */
    public Course(String courseName, String courseID)
    {
        
        codenumber = courseID;
        
        title = courseName;
        
        modules =  new ArrayList<Module>();
        
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
        else if(modules.size() > 4)
        {
            System.out.println("Please add more module(s).");
        }
    }

    /**
     * Prints out the course names and IDs.
     */
    public void print()
    {
        System.out.println("Course Name:" + title + ", Course ID:" + codenumber);
    }
}

