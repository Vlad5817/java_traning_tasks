package problem2;

public class PrimeNumber {
    public static boolean isPrime(int number){
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int someNumber = 823;
        System.out.printf("%d %s prime", someNumber,
                isPrime(someNumber) ? "is": "isn't");
    }
}
