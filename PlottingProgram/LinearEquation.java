
/**
 * Write a description of class LinearEquation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinearEquation
{
    //using the equation of a line: y = mx + b
        //initialize the values for the slope and x-intercept
        double m = .5;
        double b = 2;
        
    //this method will accept the value for x and solve the equation for y
    public double linearEquation(double x){
        //the program will calculate the y value from the inputted x value
        double y = (m * x) + b;
     
        //the method returns the value of y
        return y;
    }
    
    //returns the m variable
    public double getM(){
        
        return this.m;
    }
    
    //returns the b variable
    public double getB(){
        
        return this.b;
    }
}
