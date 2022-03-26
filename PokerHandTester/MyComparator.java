import java.util.Comparator;

//this class serves as a custom Comparator
public class MyComparator implements Comparator<Card>
{
    @Override
    public int compare(Card c1,Card c2){
        if(c1.getNumber() < c2.getNumber()){
            return -1;
        }
        else if (c1.getNumber() > c2.getNumber()){
            return 1;
        }
        return 0;
    }
}
