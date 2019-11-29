public class main {
    public static double min(double[][] arr) {
        double minValue = arr[0][0];
        for (double[] row : arr) {
            for (double val : row) {
                if (val < minValue){
                    minValue = val;
                }
            }
        }
        return minValue;
    }

    public static double max(double[][] arr) {
        double maxValue = arr[0][0];
        for (double[] row : arr) {
            for (double val : row) {
                if (val > maxValue){
                    maxValue = val;
                }
            }
        }
        return maxValue;
    }

    public static double arithmeticMean(double[][] arr) {
        double sum = 0;
        int count = 0;
        for (double[] row : arr) {
            count += row.length;
            for (double val : row) {
                    sum += val;
            }
        }
        return sum / count;
    }

    public static double geometricMean(double[][] arr) {
        double prod = 1;
        int count = 0;
        for (double[] row : arr) {
            count += row.length;
            for (double val : row) {
                if(val < 0){
                    throw new ArithmeticException("a value in array is negative");
                }
                prod *= val;
            }
        }
        return Math.pow(prod, 1. / count);
    }

    public static boolean isLocalMin(double[][] arr, int row, int col){
        for (int rowOffset = -1; rowOffset < 2; rowOffset++){
            for (int colOffset = -1; colOffset < 2; colOffset++){
                if (colOffset == 0 && rowOffset == 0){
                    continue;
                }
                try {
                    if (arr[col][row] >= arr[col + colOffset][row + rowOffset]){
                        return false;
                    };
                } catch (IndexOutOfBoundsException e){ }
            }
        }
        return true;
    }

    public static boolean isLocalMax(double[][] arr, int row, int col){
        for (int rowOffset = -1; rowOffset < 2; rowOffset++){
            for (int colOffset = -1; colOffset < 2; colOffset++){
                if (colOffset == 0 && rowOffset == 0){
                    continue;
                }
                try {
                    if (arr[col][row] <= arr[col + colOffset][row + rowOffset]){
                        return false;
                    };
                } catch (IndexOutOfBoundsException e){ }
            }
        }
        return true;
    }

    public static int[] findLocalMinPos(double[][] arr){
        double currVal;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (isLocalMin(arr, i, j)){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] findLocalMaxPos(double[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (isLocalMax(arr, i, j)){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    // я не смог понять как в java передовать функцию в качестве параметра

    public static void transpose(double[][] arr){
        int l = arr.length, h = arr[0].length;
        double buffer;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                buffer = arr[i][j];
                arr[i][j] = arr[h -1 - i][l - 1 - i];
                arr[h -1 - i][l - 1 - i] = buffer;
            }
        }
    }

    public static void main(String[] args) {
        double[][] arr = {
                {4,  3, 5},
                {4,  5, 8},
                {4, 38, 8}
        };

        System.out.printf("maximum: %f\nminimum: %f\n", max(arr), min(arr));
        System.out.printf("arithmetic mean: %f\ngeometric mean: %f\n",
                arithmeticMean(arr), geometricMean(arr));
        int[] a = findLocalMinPos(arr);
        System.out.printf("local minimum position\nrow: %d, column: %d\n",
                a[0], a[1]);
        a = findLocalMaxPos(arr);
        System.out.printf("local maximum position\nrow: %d, column: %d\n",
                a[0], a[1]);
        transpose(arr);
        System.out.println(arr);
    }
}