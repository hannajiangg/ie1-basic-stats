import java.util.List;

public class MinMaxCalculation {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 7, 10, -1);

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int findMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
