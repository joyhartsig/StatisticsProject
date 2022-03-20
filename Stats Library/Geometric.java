import java.util.Scanner;
import java.lang.Math;

public class Geometric
{
    Scanner input = new Scanner(System.in);
        
    public double p;
    public double n;

    public void getValues(){
        //get user input for the needed variables p, n, and y.
        System.out.println();
        System.out.println("Enter the p value: ");
        p = input.nextDouble();
        System.out.println("Enter the n value: ");
        n = input.nextDouble();

    }
    
    public double getMean(){
        //calculate the expected value/mean n*p
        double mean = 1/p;
                
        return mean;
    }
    
    public double getVariance(){
        //calculate the variance n*p*q
        double variance = (1-p)/(Math.pow(p, 2));
                
        return variance;
    }
    
    public double EqualTo(){       
        double probability = Math.pow(1-p, n-1)* p;
        
        return probability;
    }
    
    public double LessThan(){
        double probability = 1 - Math.pow((1-p), n - 1);
        
        return probability;
    }
    
    public double LessThanEqual(){
        double probability = 1 - Math.pow((1-p), n);
        
        return probability;
    }
    
    public double GreaterThan(){
        double probability = Math.pow((1-p), n);
        
        return probability;
    }
    
    public double GreaterThanEqual(){
        double probability = Math.pow((1-p), n - 1);
        
        return probability;
    }
    
}
