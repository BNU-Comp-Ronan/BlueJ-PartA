
/**
 * This class hold the course details.
 *
 * @author Ronan DeMelo
 * @version 04/10/2020
 */
public class Course
{
    // The ID of the course.
    private String codenumber;
    //The Name of the course
    private String coursename;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseID)
    {
        
        codenumber = courseID;
        
        coursename = courseName;
        
    }

    /**
     * Prints out the course names and IDs.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        // put your code here
        System.out.println("Course Name:" + coursename + ", Course ID:" + codenumber);
    }
}
