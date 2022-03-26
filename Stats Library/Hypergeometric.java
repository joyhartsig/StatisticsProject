import java.util.Scanner;
import java.lang.Math;

public class Hypergeometric
{
    Scanner input = new Scanner(System.in);
        
    public double N;
    public double n;
    public double r;
    public int y;
    
    public int x;
    
    public void getValues(){
        //get user input for the needed variables p, n, and y.
        System.out.println();
        System.out.println("Enter the N value: ");
        N = input.nextDouble();
        System.out.println("Enter the n value: ");
        n = input.nextDouble();
        System.out.println("Enter the r value: ");
        r = input.nextInt();
        System.out.println("Enter the y value: ");
        y = input.nextInt();
        x = y;
    }
    
    public double getMean(){
        //calculate the expected value/mean n*p
        double mean = n*(r/N);
                
        return mean;
    }
    
    public double getVariance(){
        //calculate the variance n*p*q
        double variance = n*(r/N)*((N-r)/(N))*((N-n)/(N-1));
                
        return variance;
    }
    
    public double EqualTo(){       
        double a = getCombo(r,y);
        double b = getCombo(N-r,n-y);
        double c = getCombo(N,n);
        
        double probability = (a*b)/c;
        
        return probability;
    }
    
    public double LessThan(){
        double probability = 0;
        
        for(int y = 0; y < x; y++ ){
            double a = getCombo(r,y);
            double b = getCombo(N-r,n-y);
            double c = getCombo(N,n);
        
            double sum = (a*b)/c; 
            probability += sum;
       }
               
       return probability;
    }
    
    public double LessThanEqual(){
        double probability = 0;
        
        for(int y = 0; y < x + 1; y++ ){
            double a = getCombo(r,y);
            double b = getCombo(N-r,n-y);
            double c = getCombo(N,n);
        
            double sum = (a*b)/c; 
            probability += sum;
       }
               
       return probability;  
    }
    
    public double GreaterThan(){
        double probability = 0;
        
        for(int y = x + 1; y < n + 1; y++ ){
            double a = getCombo(r,y);
            double b = getCombo(N-r,n-y);
            double c = getCombo(N,n);
        
            double sum = (a*b)/c; 
            probability += sum;
       }
               
       return probability;
    }
    
    public double GreaterThanEqual(){
        double probability = 0;
        
        for(int y = x; y < n + 1; y++ ){
            double a = getCombo(r,y);
            double b = getCombo(N-r,n-y);
            double c = getCombo(N,n);
        
            double sum = (a*b)/c; 
            probability += sum;
       }
               
       return probability;
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
