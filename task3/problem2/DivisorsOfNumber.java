package problem2;

import java.util.Iterator;

public class DivisorsOfNumber {

    public static void main(String[] args) {
        int someNumber = 12345,
            tempNumber = someNumber;
        for (int i = 2; i < someNumber; i++) {
            if (PrimeNumber.isPrime(i) && tempNumber % i == 0){
                System.out.println(i);
                do {
                    tempNumber /= i;
                } while (tempNumber % i == 0);
            }
        }
    }
}
