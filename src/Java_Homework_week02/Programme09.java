package Java_Homework_week02;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class Programme09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter character in uppercase :");
        String uppercase = in.nextLine();

        String  lowercaseString = uppercase.toLowerCase();

        System.out.println("Lowercase character is : " + lowercaseString);


    }

}
