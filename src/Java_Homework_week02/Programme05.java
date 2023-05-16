package Java_Homework_week02;
import java.util.Scanner;
/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Programme05 {
    public static void main(String args[]) {

        int a, b;

        Programme05 obj1 = new Programme05();
        Programme05 obj2 = new Programme05();

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Value of a :");
        a = s1.nextInt();
        System.out.println("Enter Value of b:");
        b = s1.nextInt();

        addition(a, b);
        subtraction(a, b);
        obj1.multiplication(a, b);
        obj2.division(a, b);

    }


    public static void addition(int a, int b) {

        System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
    }

    public static void subtraction(int a, int b) {

        System.out.println("Subtraction of " + a + " - " + b + " = " + (a - b));
    }

    public void multiplication(int a, int b) {

        Programme05 c1 = new Programme05();
        System.out.println("Multiplication of " + a + " * " + b + " = " + (a * b));
    }

    public void division(float a, float b) {

        Programme05 c2 = new Programme05();
        System.out.println("Division of " + a + " / " + b + " = " + (a / b));
    }

}