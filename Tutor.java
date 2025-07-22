

public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,
    double workingHours,double salary,String specialization,String academicQualifications,int performanceIndex)
    {
        super(teacherId,teacherName,address,workingType,employmentStatus);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;    
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public String getSpecialization()
    {
        return specialization;
    }
    
    public String getAcademicQualifications()
    {
        return academicQualifications;
    }
    
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    
    public boolean getIsCertified()
    {
        return isCertified;
    }
        
    public void setSalary(double newSalary,int newPerformanceIndex)
    {
        if(newPerformanceIndex > 5 && getWorkingHours() > 20)
        {
            double appraisal=0;
            if(newPerformanceIndex >= 5 && newPerformanceIndex <= 7)
            {
                appraisal=0.05;
            }
            else if(newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
            {
                appraisal=0.10;
            }
            else if(newPerformanceIndex == 10)
            {
                appraisal=0.20;
            }
            double approvedSalary = salary+(appraisal * salary);
            this.salary = approvedSalary;
            this.performanceIndex = newPerformanceIndex;
            isCertified=true;
        }
        else
        {
            System.out.println("Tutor not certified yet hence salary not approved");
        }
    }
    
    public void removeTutor()
    {
        if(!isCertified)
        {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            isCertified = false;
        }
        else 
        {
            System.out.println("Tutor is certified and cannot be removed");
        }
    }
    
    public void display()
    {
        super.display();
        
        if (isCertified)
        {
            System.out.println("Salary is " + salary);
            System.out.println("Specialization is " + specialization);
            System.out.println("Academic Qualifications is " + academicQualifications);
            System.out.println("Performance Index is " + performanceIndex);
        }
    }
    
}
