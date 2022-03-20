import java.util.Scanner;

//calls appropriate methods to control what prints
public class Display
{
    public void DisplayMeasures(){
        Measures measure = new Measures();
        
        System.out.println("Mean: " +measure.getMean());
        System.out.println("Median: " + measure.getMedian());
        System.out.println("Mode: " + measure.getMode());
        System.out.println();
        System.out.println("Variance of Sample (s²): " + measure.getSVariance());
        System.out.println("Variance of Population (σ²): " + measure.getPVariance());
        System.out.println("Standard Deviation of Sample (s): " + measure.getSStDev());
        System.out.println("Standard Deviation of Population (σ): " + measure.getPStDev());
        }
        
    public void DisplaySet(){
        SetOperations set = new SetOperations();
        
        System.out.println();
        System.out.println("U= "+set.setU);
        System.out.println("A= "+set.setA);
        System.out.println("B= "+set.setB);
        System.out.println();
        System.out.println("Union: set of all elements in either set.");
        System.out.println("Union (A∪B)(or): " + set.getUnion());
        System.out.println();
        System.out.println("Intersection: set of elements that are only in both sets.");
        System.out.println("Intersection (A∩B)(and): " + set.getIntersection());
        System.out.println();
        System.out.println("Compliment: all elements in not in set A.");
        System.out.println("Compliment (A’)(not): " + set.getComplimentA());
        System.out.println();
        System.out.println("Compliment: all elements in not in set B.");
        System.out.println("Compliment (B’)(not): " + set.getComplimentB());
    }
    
    public void DisplayPermsComs(){
        PermsComs set = new PermsComs();
        
        System.out.println();
        System.out.println("Permutation: number of different arrangments when order matters");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("n = total number of distinct objects     r = number of objects selected");
        System.out.println("Permutations = "+set.getPermutation());
        System.out.println();
        System.out.println("Combination: number of different arrangments when order doesn't matter");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("n = total number of distinct objects     r = number of objects selected");
        System.out.println("Combinations = "+set.getCombination());
    }
    
    public void DisplayDistributions(){
        Scanner input = new Scanner(System.in);
        
        Binomial bin = new Binomial();
        Geometric geo = new Geometric();
        Hypergeometric hyp = new Hypergeometric();
        Poisson poi = new Poisson();
        
        int option;
        do{
            System.out.println();
            System.out.println("Distributions Calculator");
            System.out.println("------------------------");
            System.out.println();
            System.out.println("Enter the number of the operation to perform: ");
            System.out.println("1- Binomial");
            System.out.println("2- Geometric");
            System.out.println("3- Hypergeometric");
            System.out.println("4- Poisson");
            System.out.println("5- Exit");
            System.out.println();
            
            option = input.nextInt();
            //switch determines what is run when the user inputs a number
            switch (option){
                case 1:
                    System.out.println();
                    System.out.println("Binomial Distribution:");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("p = probability of success");
                    System.out.println("n = number of trials");
                    System.out.println("y = number of successes in n trials");
                    System.out.println();
                    bin.getValues();
                    System.out.println();
                    System.out.println("Mean = E(Y) = "+bin.getMean());
                    System.out.println("Variance = V(Y) = "+bin.getVariance());
                    System.out.println("------------------------");
                    System.out.println("p(Y = y) = "+bin.EqualTo());
                    System.out.println("p(Y < y) = "+bin.LessThan());
                    System.out.println("p(Y ≤ y) = "+bin.LessThanEqual());
                    System.out.println("p(Y > y) = "+bin.GreaterThan());
                    System.out.println("p(Y ≥ y) = "+bin.GreaterThanEqual());
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Geometric Distribution:");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("p = probability of success");
                    System.out.println("n = number of trials before success");
                    System.out.println();
                    geo.getValues();
                    System.out.println();
                    System.out.println("Mean = E(Y) = "+geo.getMean());
                    System.out.println("Variance = V(Y) = "+geo.getVariance());
                    System.out.println("------------------------");
                    System.out.println("p(Y = n) = "+geo.EqualTo());
                    System.out.println("p(Y < n) = "+geo.LessThan());
                    System.out.println("p(Y ≤ n) = "+geo.LessThanEqual());
                    System.out.println("p(Y > n) = "+geo.GreaterThan());
                    System.out.println("p(Y ≥ n) = "+geo.GreaterThanEqual());
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Hypergeometric Distribution:");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("N = population size");
                    System.out.println("n = sample size");
                    System.out.println("r = number of selected items from population size");
                    System.out.println("y = random variable");
                    System.out.println();
                    hyp.getValues();
                    System.out.println();
                    System.out.println("Mean = E(Y) = "+hyp.getMean());
                    System.out.println("Variance = V(Y) = "+hyp.getVariance());
                    System.out.println("------------------------");
                    System.out.println("p(Y = y) = "+hyp.EqualTo());
                    System.out.println("p(Y < y) = "+hyp.LessThan());
                    System.out.println("p(Y ≤ y) = "+hyp.LessThanEqual());
                    System.out.println("p(Y > y) = "+hyp.GreaterThan());
                    System.out.println("p(Y ≥ y) = "+hyp.GreaterThanEqual());
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Poisson Distribution:");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("λ = mean- average number of occurances");
                    System.out.println("x = random variable - number of occurances");
                    System.out.println();
                    poi.getValues();
                    System.out.println();
                    System.out.println("Mean = λ = "+poi.getMean());
                    System.out.println("Variance = λ = "+poi.getVariance());
                    System.out.println("------------------------");
                    System.out.println("p(X = x) = "+poi.EqualTo());
                    System.out.println("p(X < x) = "+poi.LessThan());
                    System.out.println("p(X ≤ x) = "+poi.LessThanEqual());
                    System.out.println("p(X > x) = "+poi.GreaterThan());
                    System.out.println("p(X ≥ x) = "+poi.GreaterThanEqual());
                    break;
                case 5:
                    System.out.println("Exiting the Distribution Calculator.");
                    break;
                default:
                    System.out.println("Invaild option. Please try again.");
            }
        } while (option != 5);     
    }
}
