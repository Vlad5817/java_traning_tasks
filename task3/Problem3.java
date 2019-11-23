import java.util.Scanner;

public class Problem3 {

    public static int sumOfDivisors(int number){
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.printf("the number %s perfect",
                sumOfDivisors(number) == number ? "is" : "isn't");
    }
}
