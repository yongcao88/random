import java.util.Random;

/**
 * Created by ycao on 9/11/2015.
 */
public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        for (int i = 0; i<10; i++) {
            System.out.println(random.nextInt(20));
        }
    }
}
