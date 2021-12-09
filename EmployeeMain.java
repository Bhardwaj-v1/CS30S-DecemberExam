import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class EmployeeMain {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
         ArrayList<Employee> Employees = new ArrayList<>();
         
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Varish" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  December Exam" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
        Employees.add(new Employee(35,12.50));
        Employees.add(new Employee(40,17.25));
        Employees.add(new Employee(45,12.50));
        Employees.add(new Employee(40,25.00));
        Employees.add(new Employee(46,20.00));
        Employees.add(new Employee(21,18.75));
        Employees.add(new Employee(48,15.50));
        Employees.add(new Employee(40,32.75));
        Employees.add(new Employee(41,30.00));
        System.out.println("ID: HoursWorked: HourlyWage: Regular Pay: OT Pay: Gross Pay:");
        for(Employee e: Employees)
          System.out.println(e.toString());
          
          Employees.get(1).setHoursWorked(34);
          Employees.get(1).setHourlyWage(20.50);
          System.out.println("Here are some employees properties printed using getters");
          System.out.println(nl + Employees.get(1).getId());
          System.out.println(Employees.get(1).getHoursWorked());
          System.out.println(Employees.get(1).getHourlyWage());
          System.out.println(Employees.get(1).getRegularPay());
          System.out.println(Employees.get(1).getOTPay());
          System.out.println(Employees.get(1).getGrossPay());
          System.out.println("Employee:" + Employees.get(0).getId() + " Removed from Payroll");
          System.out.println(Employees.remove(0) + nl);
          System.out.println("ID: HoursWorked: HourlyWage: Regular Pay: OT Pay: Gross Pay:");
          for(Employee e: Employees)
          System.out.println(e.toString());
          
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
