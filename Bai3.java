import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int tuSoTong = a * d + c * b;
        int mauSoTong = b * d;

        System.out.println(tuSoTong + "/" + mauSoTong);

        sc.close();
    }
}