import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a value for x: ");
        int x = scanner.nextInt();
        System.out.print("Please input a value for n: ");
        int n = scanner.nextInt();
        int sum = 0;;
        for (int i = 0 ; i < n ; ++i)
            sum = sum + x * x;
        System.out.println("y = " + sum);
    }
}
