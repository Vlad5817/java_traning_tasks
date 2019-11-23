import java.util.Random;


public class Problem1 {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0, tails = 0;
        for (int i = 0; i < 1000; i++) {
            if(random.nextBoolean()){
                heads++;
            }else {
                tails++;
            }
        }
        System.out.printf("%d heads, %d tails", heads, tails);
    }
}
