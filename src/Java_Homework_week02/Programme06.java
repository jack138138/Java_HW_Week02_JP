package Java_Homework_week02;
import java.util.Scanner;
/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Programme06 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the radius of the circle :");
        double radius = s1.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is:" + area);
    }


}
