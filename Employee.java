/********************************************************************
 * Programmer:  Varish
 * Class:  CS30S
 *
 * Assignment: December Exam Part 1
 *
 * Description: Class for Employee
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
    private static int nextID = 1000;
    
    
    //*** Instance Variables ***
    
    private int HoursWorked;                // variable for hours worked
    private double HourlyWage;              // variable for hourly wage
    private int id;                         // id of this circle
    
    //*** Constructors ***
    
    /*****************************************
    * Description: Get a unique number for id
    * 
    * ****************************************/
    public Employee(){
        id = nextID++;          // set a unique id of circle object
                                
        this.HoursWorked = 0;
        this.HourlyWage = 0.0;
    }// end default/no-arg constructor
    /*****************************************
    * Description: Set value of the hours worked and hourly wage
    * 
    * @param        double: Hourly Wage of the person 
    *               int: Hours Worked of person
    *
    * ****************************************/
    public Employee(int hwd, double hwg){
        id = nextID++;
        
        this.HoursWorked = hwd;                  
        this.HourlyWage = hwg;
    
    }
    
    //*** Getters ***
    /*****************************************
    * Description: get worker id
    * 
    * @return       int: id number
    * ****************************************/
    public int getId(){
        return id;
    }// end getId
    /*****************************************
    * Description: get worker hourly wage
    * 
    * Interface:
    * 
    * @return       double: HourlyWage
    * ****************************************/
    public double getHourlyWage(){
        return HourlyWage;
    }// end getHourlyWage
    
    /*****************************************
    * Description: get worker hourly wage
    * 
    * Interface:
    * 
    * @return       int: HoursWorked
    * ****************************************/
    public int getHoursWorked(){
        return HoursWorked;
    }// end getHoursWorked
    
    //*** Setters ***
    /*****************************************
    * Description: set the value of the hourly wage
    * 
    * Interface:
    * 
    * @param        double: new hourly wage for the worker
    * ****************************************/
    public void setHourlyWage(double HourlyWage){
         this.HourlyWage = HourlyWage;   
    }// end setHourlyWage
    
    /*****************************************
    * Description: set the value of the hours worked
    * 
    * Interface:
    * 
    * @param        int: new hours worked for the worker
    * ****************************************/
    public void setHoursWorked(int HoursWorked){
         this.HoursWorked = HoursWorked;   
    }// end setHoursWorked
    
    // ****** other ******
    //Calculations
     /*****************************************
    * Description: get regular pay
    * 
    * Interface:
    * 
    * @return       double: regular pay
    * ****************************************/
    public double getRegularPay(){
       double RegPay;
       if(HoursWorked <= 40){
            RegPay = HourlyWage * HoursWorked;
       }
       else{
            RegPay = HourlyWage * 40;
        }
       return RegPay;
    }// end getRegPay
    
    /*****************************************
    * Description: get Overtime pay
    * 
    * Interface:
    * 
    * @return       double: Overtime pay
    * ****************************************/
    public double getOTPay(){
       double OTPay;
       if(HoursWorked > 40){
            OTPay = HourlyWage - 40 * HoursWorked;
       }
       else{
            OTPay = 0;
        }
       return OTPay;
    }// end getOTPay
    
    /*****************************************
    * Description: get Gross pay
    * 
    * Interface:
    * 
    * @return       double: Gross pay
    * ****************************************/
    public double getGrossPay(){
       double GrossPay;
       GrossPay = this.getRegularPay() + this.getOTPay();
       return GrossPay;
    }// end getOTPay
    //To String
    @Override 
    public String toString(){
      String st = "";
      st = (this.id + this.HoursWorked + " $" +this.HourlyWage);
      return st;

    }// end of ToString 
} // end of public class
