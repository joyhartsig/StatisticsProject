import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

//the Data class contains the implementation of the arrayList
public class Data
{
    //getter for the user generated arrayList
    public ArrayList<Integer> getList(){
        int numberValues = 0;
        
        //initalize an arrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        //user-input for the number of values
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        numberValues = x.nextInt();
        
        System.out.println("Enter the values: ");
        for(int i = 0; i < numberValues; i++){
            //user-input for actual values
            Scanner y = new Scanner(System.in);
            list.add(y.nextInt());
        }
        
        //sort and print the arrayList
        Collections.sort(list);
        System.out.println("The numbers you have inputed are: ");
        System.out.println(list);
        System.out.println();
        
        return list;
    }
    
    //getter for the user generated arrayList for universal set U
    public ArrayList<Integer> getSetU(){
        int numberValues = 0;
        
        //initalize two arrayLists for set U
        ArrayList<Integer> setU = new ArrayList<>();
        
        //user-input for the number of values
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of values for universal set U: ");
        numberValues = x.nextInt();
        
        System.out.println("Enter the values for set U: ");
        for(int i = 0; i < numberValues; i++){
            //user-input for actual values
            Scanner y = new Scanner(System.in);
            setU.add(y.nextInt());
        }
        
        //sort and print the arrayList for set U
        Collections.sort(setU);
        System.out.print("U= "+setU);
        System.out.println();
        
        return setU;
    }
    
    //getter for the user generated arrayList for set A
    public ArrayList<Integer> getSetA(){
        int numberValues = 0;
        
        //initalize two arrayLists for set A
        ArrayList<Integer> setA = new ArrayList<>();
        
        //user-input for the number of values
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of values for set A: ");
        numberValues = x.nextInt();
        
        System.out.println("Enter the values for set A: ");
        for(int i = 0; i < numberValues; i++){
            //user-input for actual values
            Scanner y = new Scanner(System.in);
            setA.add(y.nextInt());
        }
        
        //sort and print the arrayList for set A
        Collections.sort(setA);
        System.out.print("A= "+setA);
        System.out.println();
        
        return setA;
    }
    
    //getter for the user generated arrayList for set B
    public ArrayList<Integer> getSetB(){
        int numberValues = 0;
        
        //initalize two arrayLists for set B
        ArrayList<Integer> setB = new ArrayList<>();
        
        //user-input for the number of values
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of values for set B: ");
        numberValues = x.nextInt();
        
        System.out.println("Enter the values for set B: ");
        for(int i = 0; i < numberValues; i++){
            //user-input for actual values
            Scanner y = new Scanner(System.in);
            setB.add(y.nextInt());
        }
        
        //sort and print the arrayList for set B
        Collections.sort(setB);
        System.out.println("B = "+setB);
        System.out.println();
        
        return setB;
    }
}