import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

//the Measures() class holds the methods used to calculate the Central Measures of Tendency
public class Measures
{
    Data data = new Data();
    ArrayList<Integer> list1 = data.getList();
    
    int count = list1.size();
    
    public double getMean(){
        double sum = 0;
        
        //adds each element of the arrayList
        for(int i = 0; i < count; i++){
            sum += list1.get(i);
        }
        //divides the sum by the count
        double mean = sum / count; 
        return mean;
    }
    
    public double getMedian(){
        double median = 0;
        double lower = 0;
        double higher = 0;
        
        //sorts the arrayList from lowest-highest
        Collections.sort(list1);
        
        //if the count of the arrayList is odd:
        if(count%2 != 0){
            median = list1.get(count / 2);
        }
        //if the count of the arrayList is even:
        else{
            lower = list1.get((count/2) - 1);
            higher = list1.get(count/2);
            
            median=((higher+lower)/2);
            
        }
        return median;
    }
    
    //gets mode if there is only one unique mode
    //utilizes double nested for loops twice
    public Double getMode(){
        double mode = 0;
        double maxCount = 0;
        
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < count; i++){
            double frequency = 0;
            for(int j = i + 1; j < count; j++){
            //if two elements are equal then frequency is incremented
                if(list1.get(j) == list1.get(i)){
                frequency++;
            }
            }
            //if frequency is larger than the maxCount then frequency becomes the new maxCount
            if (frequency > maxCount){
                maxCount = frequency;
                //the element is added to the the new ArrayList 2 
                list2.clear();
                list2.add(list1.get(i));
            }
            //if there are two modes, the second element will be added to list2
            if (frequency == maxCount) {
                list2.add(list1.get(i));
              }
        }
        
        //for loop iterates through list2 to determine if there is one, more than one, or no mode
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 1; j < list2.size(); j++) {
                if (list2.get(i) == list2.get(j)) {
                    list2.remove(j);
                }
            }
            //if there is only one mode return the mode
            if (list2.size() == 1)
                mode = list2.get(i);
            //if there is more than one mode return null
            if (list2.size() > 1)
                return null;
            //if there is no mode return null
            if (mode == 0)
                return null;   
            }
        return mode;
    }
    
    //this method calculates the sample variance
    public double getSVariance(){
        double variance = 0;
        double sumSquares = 0;
        //get the mean from getMean()
        double mean = getMean();
        //for loop to determine the mean - element 
        //then squares the outcome and sets it to the sum of squares
        for(int i = 0; i < count; i++){ 
            double deviation = mean - list1.get(i);
            sumSquares += Math.pow(deviation, 2);
        }
        
        //divide the sum of the squares by count-1 for sample
        variance = sumSquares / (count -1);
        
        return variance;
    }
    
    //this method calculates the population variance
    public double getPVariance(){
        double variance = 0;
        double sumSquares = 0;
        //get the mean from getMean()
        double mean = getMean();
        //for loop to determine the mean - element 
        //then squares the outcome and sets it to the sum of squares
        for(int i = 0; i < count; i++){ 
            double deviation = mean - list1.get(i);
            sumSquares += Math.pow(deviation, 2);
        }
        
        //divide the sum of the squares by count for population
        variance = sumSquares / (count);
        
        return variance;
    }
    
    //this method calculates the sample standard deviation
    public double getSStDev(){
        //square root of the sample variance
        double stdev = Math.sqrt(getSVariance());
        
        return stdev;
    }
    
    //this method calculates the population standard deviation
    public double getPStDev(){
        //square root of the population variance
        double stdev = Math.sqrt(getPVariance());
        
        return stdev;
    }
}
