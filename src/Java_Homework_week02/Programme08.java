package Java_Homework_week02;
import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */

public class Programme08 {
    public static void main(String[] args) {

        double base;
        double height;
        double area;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter the value of base: ");
        base = a.nextInt();
        System.out.println("Enter the value of height: ");
        height = a.nextInt();
        area = (base * height) / 2;

        System.out.println("Area of triangle is :" + area);

    }


}
