import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class Plotter
{
    public void plotter()throws IOException{
        //using the equation of a line: y = mx + b in the form ax+by=c
        
        //declare the variables
        //the user-inputted a, b, and c values
        //the resulting x and y intercepts
            //ax+by=c
            double a = 2;
            double b = 5;
            double c = 7;
            
            //the variables for x and y
            double x = 0;
            double y = 0;
            
        //initalize ArrayList 
        ArrayList<Double> list1 = new ArrayList<>();
        
        //Create output .csv file
        File file = new File("plotter.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        //entry to show the equation
        bw.write("ax + by = c");
        bw.newLine();
        bw.write(a+"x + "+b+"y = "+c);
        bw.newLine();
        bw.newLine();

        //two headers for X values and Y values
        bw.write("X,Y");
        bw.newLine();
    
        //calculates the y values when x is -10 to 10
        for(x = -10; x < 11; x++){
            //formula to find the y value when knowing x
            y = (c-(a*x))/b;
            //adds the values to the csv file
            bw.write(x+","+y);
            bw.newLine();
        }
        
        //calculates the x values when y is -10 to 10
        for(y = -10; y < 11; y++){
            //formula to find the x value when knowing y
            x = (c-(b*y))/a;
            //adds the values to the csv file
            bw.write(x+","+y);
            bw.newLine();
        }
    
        //close the file and writer methods
        bw.close();
        fw.close();
    }
}
