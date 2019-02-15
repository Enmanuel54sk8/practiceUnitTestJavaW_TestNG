import java.util.Random;

public class RandomThings {

    public int[] returnInts(){
        Random random = new Random();
        return random.ints(2,0,100).toArray();
    }
}
