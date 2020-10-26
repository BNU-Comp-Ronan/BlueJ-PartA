
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
    

    /**
     * Constructor for objects of class Course.
     */
    public Course(String courseName, String courseID)
    {
        
        codenumber = courseID;
        
        title = courseName;
        
    }

    /**
     * Prints out the course names and IDs.
     */
    public void print()
    {
        System.out.println("Course Name:" + title + ", Course ID:" + codenumber);
    }
}

