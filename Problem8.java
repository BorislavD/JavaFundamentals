import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        //Read from the console n numbers which average will be calculated. It is a general case scenario,
        // not only for 3 numbers, as is the task.
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = console.nextDouble();
            sum += numbers[i];
            average = sum / numbers.length;
        }

        System.out.printf("%.2f", average);


    }
}
