import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Plotter
{
    public void salter()throws IOException{
        //initalize ArrayList 
        ArrayList<Double> list1 = new ArrayList<>();
        
        //Create output .csv file
        File file = new File("salter.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner sc = new Scanner(new File("plotter.csv"));
         
        
        
        
        //entry to show the equation
        bw.write("ax + by = c");
        bw.newLine();
        bw.write(a+"x + "+b+"y = "+c);
        bw.newLine();
        bw.newLine();

        //two headers for X values and Y values
        bw.write("X,Y");
        bw.newLine();
    
    
        //close the file and writer methods
        bw.close();
        fw.close();
    }
}
