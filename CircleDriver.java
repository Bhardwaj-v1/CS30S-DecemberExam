import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Circle OOP driver code
 * 
 *  Description:    driver code for the Circle class example
 * 
 *************************************************************/

public class CircleDriver {

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
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Circle OOP Example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
    
        Circle c1 = new Circle();       // instantiate a new Circle object
        Circle c2 = new Circle(4.45);   // with an argument
        
        System.out.println("Cirlce 1: " + c1.getId() + ", " + c1.getRadius());
        c1.setRadius(3.0);
        System.out.println("Cirlce 1: " + c1.getId() + ", " + c1.getRadius());
        System.out.format("Circle 1 Area: %8.3f%s", c1.getArea(), nl);
        
        System.out.println("Cirlce 2: " + c2.getId() + ", " + c2.getRadius());
        
        System.out.println();
        System.out.println("**** Print Circle Details Using toString()" + nl);
        System.out.println(c1);
        
        
    
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
