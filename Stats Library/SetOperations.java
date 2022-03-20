import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class SetOperations
{
    Data data = new Data();
    //ArrayLists are generated for set U and subset A and B
    ArrayList<Integer> setU = data.getSetU();
    ArrayList<Integer> setA = data.getSetA();
    ArrayList<Integer> setB = data.getSetB();
    
    //the union of subsets A and B include elements that are in either A and B
    public Set<Integer> getUnion(){
        Set<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);
    
        return union;
        }
    
    //the intersection of subsets A and B include all elements that are only in both A and B 
    public ArrayList<Integer> getIntersection(){
        ArrayList<Integer> intersection = new ArrayList<>(setA);
        intersection.retainAll(setB);
        
        return intersection;
        }
    
    //the compliment of subset A is found from removing all elements from set U that are in A
    public Set<Integer> getComplimentA(){
        Set<Integer> complimentA = new HashSet<>(setU);
        complimentA.removeAll(setA);
    
        return complimentA;
        }
    
    //the compliment of subset B is found from removing all elements from set U that are in B
    public Set<Integer> getComplimentB(){
        Set<Integer> complimentB = new HashSet<>(setU);
        complimentB.removeAll(setB);
        
        return complimentB;
        }
}
