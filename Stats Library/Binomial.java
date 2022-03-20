import java.util.Scanner;
import java.lang.Math;

public class Binomial
{
    Scanner input = new Scanner(System.in);
    
    double probability = 0;
        
    public double p;
    public double n;
    public int y;
    public int x;
    
    public void getValues(){
        //get user input for the needed variables p, n, and y.
        System.out.println();
        System.out.println("Enter the p value: ");
        p = input.nextDouble();
        System.out.println("Enter the n value: ");
        n = input.nextDouble();
        System.out.println("Enter the y value: ");
        y = input.nextInt();
        x = y;

    }
    
    public double getMean(){
        //calculate the expected value/mean n*p
        double mean = n * p;
                
        return mean;
    }
    
    public double getVariance(){
        //calculate the q value
        double q = 1 - p;
        
        //calculate the variance n*p*q
        double variance = n * p * q;
                
        return variance;
    }
    
    public double EqualTo(){       
        //calculate the q value
        double q = 1 - p;
        
        //calculate the probability
        //1. calculate the combination of n and y
        long combination = getCombo(n,y);
        
        //2. calculate p^y
        double a = Math.pow(p, y);
        
        //3. calculate q^n-y
        double b = Math.pow(q, n-y);
        
        //4. multiply the results
        probability = combination*a*b;
        
        return probability;
    }
    
    public double LessThan(){
        double sum = 0;
        for(int y = 0; y < x; y++ ){
            //calculate the q value
            double q = 1 - p;
            
            //calculate the probability
            //1. calculate the combination of n and y
            long combination = getCombo(n,y);
            
            //2. calculate p^y
            double a = Math.pow(p, y);
            
            //3. calculate q^n-y
            double b = Math.pow(q, n-y);
            
            //4. multiply the results
            double result = combination*a*b;
            
            //commented out testing code
                //System.out.println("y = "+y);
                //System.out.println("result= "+result);
            
            sum += result;
       }
        
       return sum;
    }
    
    public double LessThanEqual(){
        double sum = 0;
        for(int y = 0; y < x + 1; y++ ){
            //calculate the q value
            double q = 1 - p;
            
            //calculate the probability
            //1. calculate the combination of n and y
            long combination = getCombo(n,y);
            
            //2. calculate p^y
            double a = Math.pow(p, y);
            
            //3. calculate q^n-y
            double b = Math.pow(q, n-y);
            
            //4. multiply the results
            double result = combination*a*b;
            
            //commented out testing code
                //System.out.println("y = "+y);
                //System.out.println("result= "+result)
                
            sum += result;
       }
        
       return sum;
    }
    
    public double GreaterThan(){
        double sum = 0;
        for(int y = x + 1; y < n + 1; y++ ){
            //calculate the q value
            double q = 1 - p;
            
            //calculate the probability
            //1. calculate the combination of n and y
            long combination = getCombo(n,y);
            
            //2. calculate p^y
            double a = Math.pow(p, y);
            
            //3. calculate q^n-y
            double b = Math.pow(q, n-y);
            
            //4. multiply the results
            double result = combination*a*b;
            
            //commented out testing code
                //System.out.println("y = "+y);
                //System.out.println("result= "+result);
                
            sum += result;
       }
        
       return sum;
    }
    
    public double GreaterThanEqual(){
        double sum = 0;
        for(int y = x; y < n + 1; y++ ){
            //calculate the q value
            double q = 1 - p;
            
            //calculate the probability
            //1. calculate the combination of n and y
            long combination = getCombo(n,y);
            
            //2. calculate p^y
            double a = Math.pow(p, y);
            
            //3. calculate q^n-y
            double b = Math.pow(q, n-y);
            
            //4. multiply the results
            double result = combination*a*b;
            
            //commented out testing code
                //System.out.println("y = "+y);
                //System.out.println("result= "+result);
                
            sum += result;
       }
        
       return sum;
    }
    
    public long getCombo(double n,double y){
        long combination = 0;
        
        double x = (n-y);
       
        //calculating the factorial for n
        long factorialn = 1;
        for(int i = 1; i <= n; i++ ){
           factorialn *= i;
       }
       
       //calculating the factorial for y
       long factorialy = 1;
       for(int i = 1; i <= y; i++ ){
           factorialy *= i;
       }
       
       //calculating the factorial for n-y
       long factorialx = 1;
       for(int i = 1; i <= x; i++ ){
           factorialx *= i;
       }
       
       //combination formula
       combination = factorialn/(factorialy*factorialx);
       
       return combination;
    }
}
