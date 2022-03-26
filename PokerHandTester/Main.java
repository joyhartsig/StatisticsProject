import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        HandEvaluator h = new HandEvaluator();
        
        //sets the number of trials
        int trials = 10000; 
        
        //sets the variable for the count of matches
        double pairCount = 0;
        double threeCount = 0;
        double twoPairCount = 0;
        double straightCount = 0;
        double fullhouseCount = 0;
        double flushCount = 0;
        double fourCount = 0;
        
        for (int i = 1; i < trials; i++){
            ArrayList<Card> hand = h.getHand();
            
            if(h.testPair(hand) == true){
                pairCount++;
            }

            //System.out.println(hand);
            //System.out.println(pairCount);
            if(h.testThreeKind(hand) == true){
                threeCount++;
            }
            //System.out.println(hand);
            //System.out.println(threeCount);
            
            if(h.testTwoPair(hand) == true){
                twoPairCount++;
            }
            
            if(h.testStraight(hand) == true){
                straightCount++;
            }
            
            if(h.testFullHouse(hand) == true){
                fullhouseCount++;
            }
            
            if(h.testFlush(hand) == true){
                flushCount++;
            }
            
            if(h.testFourKind(hand) == true){
                fourCount++;
            }
            
        }
        
        
        System.out.println("Poker Hand Tester");
        System.out.println("-------------------------");
        System.out.println("The probability of getting a pair in "+trials+" hands is: "+h.getProbability(pairCount)+"%");
        System.out.println();        
        System.out.println("The probability of getting three of a kind in "+trials+" hands is: "+h.getProbability(threeCount)+"%");
        System.out.println();
        System.out.println("The probability of getting two pairs in "+trials+" hands is: "+h.getProbability(twoPairCount)+"%");
        System.out.println();
        System.out.println("The probability of getting a straight in "+trials+" hands is: "+h.getProbability(straightCount)+"%");
        System.out.println();
        System.out.println("The probability of getting a full house in "+trials+" hands is: "+h.getProbability(fullhouseCount)+"%");
        System.out.println();
        System.out.println("The probability of getting a flush in "+trials+" hands is: "+h.getProbability(flushCount)+"%");
        System.out.println();
        System.out.println("The probability of getting four of a kind in "+trials+" hands is: "+h.getProbability(fourCount)+"%");
        System.out.println();
        System.out.println("Poker Hand Probabilities for Reference");
        System.out.println("-------------------------");
        System.out.println("The probability of getting a pair should be: 42.26% ");
        System.out.println();
        System.out.println("The probability of getting three of a kind should be: 2.11%");
        System.out.println();
        System.out.println("The probability of getting two pairs should be: 4.75% ");
        System.out.println();
        System.out.println("The probability of getting a straight should be: 0.39% ");
        System.out.println();
        System.out.println("The probability of getting a full house should be: 0.14% ");
        System.out.println();
        System.out.println("The probability of getting a flush should be: 0.19% ");
        System.out.println();
        System.out.println("The probability of getting four of a kind should be: 0.02%");
        }
    }

