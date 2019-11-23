package problem2;

public class MaxDigit {
    public static int maxDigit(int number){
        int result = number % 10;
        number = Math.abs(number);
        while (number != 0){
            if (number % 10 > result){
                result = number % 10;
            }
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int someNumber = -129456;
        System.out.printf("maxDigit of %d - %d\n",
                someNumber, maxDigit(someNumber));
    }
}
