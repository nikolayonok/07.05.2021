import java.util.Scanner;

import static java.lang.Math.floor;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        double num = sc.nextDouble();
        if (num % 1 == 0) {
            System.out.println("Целое число");
        } else {
            System.out.println("Дробное число");
        }
    }
}
