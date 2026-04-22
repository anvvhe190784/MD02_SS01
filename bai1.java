import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính của hình tròn (radius): ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;


        System.out.printf("Diện tích của hình tròn có bán kính %.2f là: %.2f\n", radius, area);

        sc.close();
    }
}