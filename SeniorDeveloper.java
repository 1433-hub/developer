/**
 * It is the sub class(SeniorDeveloper) of class(Developer) using more dataType(int,String,double,boolean) with different variables and also using accessor method(get) for each variables
 * 
 *
 * @author (Gagan Hang Limbu(Patangwa))
 * @version (2019-01-01)
 */
public class SeniorDeveloper extends Developer
{
   //initializing variables 
   private int salary;
   private String joiningDate;
   private String staffRoomNumber;
   private double contractPeriod;
   private int advanceSalary;
   private boolean appointed;
   private boolean terminated;
   
   /**
    * constructing the class(SeniorDeveloper) with five parameters(String platform,String interviewerName,int workingHour,int salary,double contractPeriod)
    */
   public SeniorDeveloper(String platform,String interviewerName,int workingHour,int salary,double contractPeriod)
   {
       super(platform,interviewerName,workingHour);
       this.salary=salary;
       this.contractPeriod=contractPeriod;
       joiningDate="";
       staffRoomNumber="";
       advanceSalary=0;
       appointed=false;
       terminated=false;
    }
    
    /**
     * store the value in salary
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * store the value in joiningDate
     */
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    /**
     * store the value in staffRoomNumber
     */
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    
    /**
     * store the value in contractPeriod
     */
    public double getContractPeriod()
    {
        return contractPeriod;
    }
    
    /**
     * store the value in advanceSalary
     */
    public int getAdvanceSalary()
    {
        return advanceSalary;
    }
    
    /**
     * store the value in appointed
     */
    public boolean getAppointed()
    {
        return appointed;
    }
    
    /**
     * store the value in terminated
     */
    public boolean getTerminated()
    {
        return terminated;
    }
    
    /**
     * fix the value of salary
     */
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    
    /**
     * fix the value of contractPeriod
     */
    public void setContractPeriod(double contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    
    /**
     * fix the value of joiningDate
     */
    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate=joiningDate;
    }
    
    /**
     * fix the value of advanceSalary
     */
    public void setAdvanceSalary(int advanceSalary)
    {
        this.advanceSalary=advanceSalary;
    }
    
    /**
     * fix the value of appointed
     */
    public void setAppointed(boolean appointed)
    {
        this.appointed=appointed;
    }
    
    /**
     * fix the value of terminated
     */
    public void setTerminated(boolean terminated)
    {
        this.terminated=terminated;
    }
    
    /**
     *display the value of variables which are store in this method within parameter(String developerName,String joiningDate,int advanceSalary,String staffRoomNumber)
     */
    public void hiredeveloper(String developerName,String joiningDate,int advanceSalary,String staffRoomNumber)
    {
        
        if(appointed == true) 
        {   
        System.out.println("Name of developer= "+getDeveloperName());
        System.out.println("Room no. for staff= "+getStaffRoomNumber());
        }
    
        else
         {
        super.setDeveloperName(developerName);
        this.joiningDate=joiningDate;
        this.staffRoomNumber=staffRoomNumber;
        this.advanceSalary=advanceSalary;
        appointed=true;
        terminated=false;
         }
    }
    
    public void contactTermination()
    {
        
        //if terminated is true it prints t
        if (terminated== true) 
        {
            System.out.println("Developer is terminated");
        }
        else
        {
            super.setDeveloperName("");
            setJoiningDate("");
            setAdvanceSalary(0);
            setAppointed(false);
            setTerminated(true);
        }
    }
    
    /**
     * display the value of variables which are store in this method
     */
    public void display1()
    {
        System.out.println("Platform: "+super.getPlatform());
        System.out.println("Interviewer Name: "+super.getInterviewerName());
        System.out.println("Salary: "+getSalary());
    }
    
    /**
     * display the value of variables which are store in this method and also display from class(Developer)
     */
    public void display()
    {
        super.display();
        if(appointed==true){
            System.out.println("termination status:"+getTerminated());
            System.out.println("joiningDate: "+getJoiningDate());
            System.out.println("advanceSalary: "+getAdvanceSalary());
            System.out.println("developerName: "+super.getDeveloperName());
        }
    }
}
