import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber = sc.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Giá trị firstNumber: " + firstNumber);
        System.out.println("Giá trị secondNumber: " + secondNumber);
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Số dư: " + remainder);

        sc.close();
    }
}