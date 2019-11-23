package problem2;

public class CountOfDifferentDigits {
    public static int countOfDifferentDigits(int number) {
        if (number == 0){
            return 1;
        }
        int length = 0, tempNumber = number, result = 0;
        while (tempNumber != 0){
            tempNumber /= 10;
            length++;
        }
        for (int i = 0; i < 9; i++) {
            tempNumber = number;
            for (int j = 0; j < length; j++) {
                if (tempNumber % 10 == i){
                    result++;
                    break;
                }
                tempNumber /= 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int someNumber = 1320;
        System.out.printf("%d has %d different digits",
                someNumber, countOfDifferentDigits(someNumber));
    }
}
