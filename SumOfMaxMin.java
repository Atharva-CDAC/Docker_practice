import java.util.Scanner;

public class SumOfMaxMin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number : ");
            Integer num1 = sc.nextInt();

            System.out.print("Enter second number : ");
            Integer num2 = sc.nextInt();

            System.out.print("Enter third number : ");
            Integer num3 = sc.nextInt();

            Integer max = num1;
            Integer min = num1;

            if (num2 > max) {
                max = num2;
            }

            if (num2 < min) {
                min = num2;
            }

            if (num3 > max) {
                max = num3;
            }

            if (num3 < min) {
                min = num3;
            }

            Integer sum = max + min;

            System.out.printf("Sum of max number(" + max + ") and min number(" + min + ") is " + sum);
        }
    }
}