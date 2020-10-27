import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * 
 * Modified by Ronan DeMelo (26/10/2020)
 */
public class Student
{
    // The student's full name
    private String name;
    
    // The student ID
    private String id;
    
    // The amount of credits for study taken so far
    private int credits;
    
    // Hold the grades of the student.
    private int grades;
    
    // Allows Student to communicate with student class.
    private ArrayList<Course> courses;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
        
        //This will show what course the students are doing.
        courses = new ArrayList<Course>();
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
    
    /**
     * This is the method that add the course that the sutdent is doing.
     */
    public void enrollCourses(Course newCourse)
    {
        courses.add(newCourse);
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * This will calculate and print the students grades.
     */
    public void insertGrades(int grades)
    {
        grades = 0;
    }
    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        for(Course coursename : courses)
        {//This code gets the course name and ID from the courses class.
            coursename.print();
        }
    }
    
    /**
     * This will print the studenst grades
     */
    public void printGrades()
    {
        if(grades <= 40)
        {
            System.out.print(name + "'s Grades: F");
        }
        else if((grades <= 49) && (grades >= 41))
        {
            System.out.print(name + "'s Grades: D");
        }
        else if((grades >= 59) && (grades >= 50))
        {
            System.out.print(name + "'s Grades: C");
        }
        else if((grades >= 69) && (grades >= 60))
        {
            System.out.print(name + "'s Grades: B");
        }
        else if((grades >= 100) && (grades >= 70))
        {
            System.out.print(name + "'s Grades: A");
        }
        else
        {  
            System.out.print("Please enter a valid grade.");
        }
    }
}
