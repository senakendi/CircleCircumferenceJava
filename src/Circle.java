
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle.");
        int radius = scan.nextInt();
        System.out.println("Circumference of the circle = " + (2 * Math.PI * radius));
    }
}
