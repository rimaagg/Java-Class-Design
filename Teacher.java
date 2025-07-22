
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher
{
    private int teacherId;//Instance variable
    private String teacherName;
    private  String address;
    private String workingType;
    private String employmentStatus;
    private double workingHours;
    
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        //assigning variable with parameter values
     
    }
    
   
    public int getTeacherId()//Getter method/accessor method
    {
        return this.teacherId;    
    }
    
    public String getTeacherName()
    {   
        return this.teacherName;    
    }
        
    public String getAddress()
    {
        return this.address;
    }
    
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    
    public double getWorkingHours()
    {
        return this.workingHours;
    }
    
    public void setWorkingHours(double workingHours)
    {
        this.workingHours=workingHours;
    }
    
    public void display()
    {
        System.out.println("Teacher ID is "+ teacherId);
        System.out.println("Teacher Name is " + teacherName);
        System.out.println("Address is " + address);
        System.out.println("Working Type is " + workingType);
        System.out.println("Employment Status is " + employmentStatus);
        
        if(workingHours == 0)
        {
            System.out.println("Value has not been assigned");
        }
        else
        {
            System.out.println ("Working hours is " + workingHours);
        }
    }
}
