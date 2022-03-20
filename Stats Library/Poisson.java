import java.util.Scanner;
import java.lang.Math;

public class Poisson
{
    Scanner input = new Scanner(System.in);
        
    public double m;
    public int x;
        
    public void getValues(){
        //get user input for the needed variables p, n, and y.
        System.out.println();
        System.out.println("Enter the λ value: ");
        m = input.nextDouble();
        System.out.println("Enter the x value: ");
        x = input.nextInt();
    }
    
    public double getMean(){
        double mean = m;
        
        return mean;
    }
    
    public double getVariance(){
        double variance = m;
    
        return variance;
    }
    
    public double EqualTo(){       
        double a = -m;
        
        long factorialx = 1;
       for(int i = 1; i <= x; i++ ){
           factorialx *= i;
       }
       double b = Math.pow(m, x);
       long c = factorialx;
       double d = Math.exp(a);
       double probability = (b/c)*d;
       
       return probability;
    }
    
    public double LessThan(){
        double probability = 0;
        
        for(int x = 0; x < m - 1; x++ ){
            double a = -m;
            
            long factorialx = 1;
            for(int i = 1; i <= x; i++ ){
                factorialx *= i;
            }
       
            double b = Math.pow(m, x);
            long c = factorialx;
            double d = Math.exp(a);
            double e = (b/c)*d;
            probability += e;
       }
        
       return probability;
    }
    
    public double LessThanEqual(){
        double probability = 0;
        
        for(int x = 0; x < m; x++ ){
            double a = -m;
            
            long factorialx = 1;
            for(int i = 1; i <= x; i++ ){
                factorialx *= i;
            }
       
            double b = Math.pow(m, x);
            long c = factorialx;
            double d = Math.exp(a);
            double e = (b/c)*d;
            probability += e;
       }
        
       return probability;
    }
    
    public double GreaterThan(){
       double p = LessThanEqual();
       double probability = 1 - p;
        
       return probability;
    }
    
    public double GreaterThanEqual(){
       double p = LessThan();
       double probability = 1 - p;
        
       return probability;
    }
    
}
