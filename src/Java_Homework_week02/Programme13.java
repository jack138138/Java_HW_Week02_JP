package Java_Homework_week02;
import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */


public class Programme13 {
    public static void main(String[] args) {


        Scanner z = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = z.nextInt();
        System.out.println("Enter second number: ");
        double b = z.nextInt();
        System.out.println("Enter third number: ");
        double c  = z.nextInt();
        z.close();

        System.out.println("Average value is :" + average(a,b,c)  );

    }

    public static double average(double a,double b,double c) {

        return (a + b + c) / 3;
    }



}
