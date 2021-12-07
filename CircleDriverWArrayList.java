import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Circle OOP driver code
 * 
 *  Description:    driver code for the Circle class example
 * 
 *************************************************************/

public class CircleDriverWArrayList {

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
    
        ArrayList<Circle> circles = new ArrayList<>();
    
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
        
        circles.add(c1);        // now circles(0) points to c1
        circles.add(c2);
        circles.add(new Circle(2.5));
        
        // System.out.println("Print the arraylist?");
        // System.out.println(circles);
        // System.out.println("-----------------" + nl);
        
        System.out.println("Print the arraylist?");
        for(Circle c: circles)
            System.out.println(c);
            
        System.out.println("-----------------" + nl);
        
        // get and use individual arraylist elements and element methods
        System.out.println("Print some individual list elements");
        System.out.println(circles.get(0));
        
        System.out.format("%5.3f%s",circles.get(1).getArea(), nl);
        circles.get(1).setRadius(1.25);
        System.out.format("%5.3f%s",circles.get(1).getRadius(), nl);
        
        // use the size() method of the array list
        System.out.println(circles.size());
        circles.add(new Circle(5.57));
        System.out.println(circles.size());
        System.out.println(circles.remove(0));
        System.out.println(circles.size());
        
    
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
