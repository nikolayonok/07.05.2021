import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }
    }
}