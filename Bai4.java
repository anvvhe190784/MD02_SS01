import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float width = sc.nextFloat();
        float height = sc.nextFloat();

        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.println(area);
        System.out.println(perimeter);

        sc.close();
    }
}