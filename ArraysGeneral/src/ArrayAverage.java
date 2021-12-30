public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double harmonicSum =0.0;
        for (int number : numbers) {
            sum += number;
            harmonicSum += 1.0/number;
        }

        System.out.println(sum / numbers.length);
        System.out.println(numbers.length / harmonicSum);
    }
}
