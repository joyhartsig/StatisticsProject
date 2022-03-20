import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu
{
    Display display = new Display();
    public Menu(){
        Scanner input = new Scanner(System.in);
        int option;
        
        //displays the menu with 4 options
        do{
            System.out.println();
            System.out.println("Stats Library Calculator");
            System.out.println("------------------------");
            System.out.println();
            System.out.println("Enter the number of the operation to perform: ");
            System.out.println("1- Measures of Central Tendency");
            System.out.println("2- Permutation & Combination");
            System.out.println("3- Set Operations");
            System.out.println("4- Distributions");
            System.out.println("5- Exit");
            System.out.println();
            
            option = input.nextInt();
            //switch determines what is run when the user inputs a number
            switch (option){
                case 1:
                    display.DisplayMeasures();
                    break;
                case 2:
                    display.DisplayPermsComs();
                    break;
                case 3:
                    display.DisplaySet();
                    break;
                case 4:
                    display.DisplayDistributions();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invaild option. Please try again.");
            }
        } while (option != 5);
    }
    }


