/**
 * It is also the sub class(JuniorDeveloper) of class(Developer) using same data type as in another sub class but with different variables and using accessor metheod(get) for each variables
 *
 * @author (Gagan Hang Limbu(Patangwa))
 * @version (2019-01-01)
 */
public class JuniorDeveloper extends Developer
{
    //initializing variables
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    /**
     * constructing the class(JuniorDeveloper) with six parameter(String platform,String interviewerName,int workingHour,int salary,String appointedBy,String terminationDate)
     */
    public JuniorDeveloper(String platform,String interviewerName,int workingHour,int salary,String appointedBy,String terminationDate)
    {
        super(platform,interviewerName,workingHour);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined=false;
    }
    
    /**
     * store the value in salary
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * store the value in appointedDate
     */
    public String getAppointedDate()
    {
        return appointedDate;
    }
    
    /**
     * store the value in evaluationPeriod
     */
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    
    /**
     * store the value in terminationDate
     */
    public String getTerminationDate()
    {
        return terminationDate;
    }
    
    /**
     * store the value in specialization
     */
    public String getSpecialization()
    {
        return specialization;
    }
    
    /**
     * store the value in appointedBy
     */
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    /**
     * store the value in joined
     */
    public boolean getJoined()
    {
        return joined;
    }
    
    /**
     * display the methods for change in salary
     */
    public void setSalary(int Salary)
    {
        if (joined==true)
        {
                this.salary=salary;
        }
        else {
            System.out.println("The"+super.getDeveloperName()+"is already appointed. So salary cannot be changed.");
        }
    }
    
    /**
     * method is used to display the developerName
     */
    public void appointDeveloper(String developerName,String appointedDate,String terminationDate,String specilization)
    {
        if(joined==false)
        {
            super.setDeveloperName(developerName);
            joined=true;
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
        }
        else{
            System.out.println(super.getDeveloperName()+" is already appointed");
        }
    }
    
    /**
     * display the value of variables which are store in this method and also display from class(Developer)
     */
    public void display()
    {
        super.display();
        if(joined==true)
        {
            System.out.println("appointedDate:"+getAppointedDate()+"\n"+"Developer Name: "+super.getDeveloperName());
            System.out.println("Evaluation Period: "+getEvaluationPeriod());
            System.out.println("Termination date: "+getTerminationDate());
            System.out.println("Salary: "+getSalary());
            System.out.println("Specialization: "+getSpecialization());
            System.out.println("Appointed: "+getAppointedBy());
        }
    }
}
