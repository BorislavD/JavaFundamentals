import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
