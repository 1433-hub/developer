
/**
 * This class(Developer) provide constructor(Developer),accessor methods(Get) for each attributes.
 * private and public access modifier are used in this class.
 * Many necessary dataType(String,double) are used in this class.
 * Using indirect object(this) to initiliaze current class data member.
 * 
 * @author (Gagan Hang Limbu(Patangwa))
 * @version (2019-01-01)
 */
public class Developer
{
    //intializing instance variables with given dataType using private access modifier
    private String platform;
    private String developerName;
    private String interviewerName;
    private double workingHour;
    
    /**
     * constructing the class(Developer) with three parameter(String platform,String interviewerName,double workingHour )
     */
    public Developer(String platform,String interviewerName,double workingHour)
    {
        //initializing variables
        this.platform=platform;
        developerName="";
        this.interviewerName=interviewerName;
        this.workingHour=workingHour;
    }
    
    /**
     *  store the value in developerName
     */
    public String getDeveloperName()
    {
        return developerName;
    }
    
    /**
     * store the value in platform
     */
    public String getPlatform()
    {
        return platform;
    }
    
    /**
     * store the value in interviewerName
     */
    public String getInterviewerName()
    {
        return interviewerName;
    }
    
    /**
     * store the value in workingHour
     */
    public double getWorkingHour()
    {
        return workingHour;
    }
    
    /**
     * fix the value of developerName 
     */ 
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
    }
    
    /**
     * display the value of variables which are store in this methods
     */
    public void display()
    {
        System.out.println("Platform:"+platform);
        System.out.println("Interviewer Name: "+interviewerName);
        System.out.println("Working Hour: "+workingHour);
        if (!(developerName.equals(""))){
            
        System.out.println("Developer Name: "+getDeveloperName());
        }
    }
    
}
