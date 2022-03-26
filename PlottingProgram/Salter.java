import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

//The Salter class creates a csv file that adds a random integer to the y- values
class Salter
{
    public void salter()throws IOException{
        //initializes the x variable
        int x = 0;
        
        //initalize the equation class
        LinearEquation e = new LinearEquation();
               
        //Create output .csv file
        File file = new File("salter.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        //entry to show the equation
        bw.write("Salter:");
        bw.newLine();
        bw.write("y = mx + b");
        bw.newLine();
        bw.write("y = "+e.getM()+"x + "+e.getB());
        bw.newLine();
        bw.newLine();

        //two headers for X values and Y values
        bw.write("X,Y");
        bw.newLine();
        
        
        Random r = new Random();
        //generates a random number
        int a = r.nextInt();
    
        //calculates the y values when x is 0 to 20
        for(x = 0; x <= 20; x++){
            //sets y equal to the out put of the equation
            double y = e.linearEquation(x);
            
            //adds the random integer to the y value
            y+=a;
            
            //adds the values to the csv file
            bw.write(x+","+y);
            bw.newLine();
            
        }
    
        //close the file and writer methods
        bw.close();
        fw.close();
    }
}
