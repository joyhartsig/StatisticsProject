import java.util.Scanner;

public class PermsComs
{
    Scanner input = new Scanner(System.in);
    
   public long getPermutation(){
       long permutation = 0;
       
       System.out.println();
       System.out.println("Enter the total number of distinct objects (n): ");
       int n = input.nextInt();
        
       System.out.println("Enter the number of objects selected (r): ");
       int r = input.nextInt();
       
       //calculating the factorial for n
       long factorialn = 1;
       for(int i = 1; i <= n; i++ ){
           factorialn *= i;
       }
       
       //calculating the factorial for n-r
       int x = (n-r);
       long factorialx = 1;
       for(int i = 1; i <= x; i++ ){
           factorialx *= i;
       }
       
       //permutation formula
       permutation = (factorialn)/(factorialx);
       
       return permutation;
   }
   
   public long getCombination(){
       long combination = 0;
       
       System.out.println();
       System.out.println("Enter the total number of distinct objects (n): ");
       int n = input.nextInt();
        
       System.out.println("Enter the number of objects selected (r): ");
       int r = input.nextInt();
       
       int x = (n-r);
       
       //calculating the factorial for n
       long factorialn = 1;
       for(int i = 1; i <= n; i++ ){
           factorialn *= i;
       }
       
       //calculating the factorial for r
       long factorialr = 1;
       for(int i = 1; i <= r; i++ ){
           factorialr *= i;
       }
       
       //calculating the factorial for n-r
       long factorialx = 1;
       for(int i = 1; i <= x; i++ ){
           factorialx *= i;
       }
       
       //combination formula
       combination = factorialn/(factorialr*factorialx);
       
       return combination;
   }
}
