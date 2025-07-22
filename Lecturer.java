/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{   
    private String department;//Instance variable
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,String department,int yearsOfExperience)//constructor
    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;//instance variable to parameters
    }
    
    public String getDeparment()//Getter or accessor method
    {
        return this.department;
    }
    
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    
    public void setGradedScore(int gradedScore)//mutator/setter method
    {
        this.gradedScore=gradedScore;
    }
    
    public void gradeAssignment(int gradedScore,String department,int yearsOfExperience)
    {
        if(yearsOfExperience>=5 && this.department == department)
        {
            if(gradedScore>=70)
            {
                System.out.println("Grade A");
            }
            else if(gradedScore>=60)
            {
                System.out.println("Grade B");
            }
            else if(gradedScore>=50)
            {
                System.out.println("Grade C");
            }
            else if(gradedScore>=40)
            {
                System.out.println("Grade D");
            }
            else
            {
                System.out.println("Grade E");
            }
            hasGraded=true;
        }
            else
            {
                System.out.println("Lecturer has not been graded");
            }
        
    }
    
    public void display()//method to display details of lecturer
    {
        super.display();//calling to display of superclass teacher
        System.out.println("Department is " + department);
        System.out.println("Years Of Experience is " + yearsOfExperience);
        if(hasGraded = true)
            {
                System.out.println("GradedScore is " + gradedScore);
            }
            else
            {
                System.out.println("Not graded");
            }
    }
}
