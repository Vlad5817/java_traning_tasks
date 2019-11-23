package problem2;

public class Palindrome {
    public static boolean isPalindrome(int number){
        int lengthPower = 1, length = 0;
        while (number / lengthPower != 0){
            lengthPower *= 10;
            length++;
        }
        for (int i = 0; i < length / 2; i++) {
            if(number / (lengthPower / 10) != number % 10){
                return false;
            } else {
                number /= 10;
                lengthPower /= 100;
                number %= lengthPower;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int someNumber = 12321;
        System.out.println(someNumber +
                (isPalindrome(someNumber) ? " is ":" isn't ") +
                "palindrome");
    }
}
