package Java_Homework_week02;
import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme07 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }

}
