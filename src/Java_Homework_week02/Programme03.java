package Java_Homework_week02;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */

public class Programme03 {

    int a = 10;
    static int b = 15;

    public static void main(String[] args) {

        Programme03 o1 = new  Programme03();
        o1.m1();
        m2();

    }

    public void m1() {
      Programme03 c = new Programme03();
        System.out.println(c.a);
        System.out.println(c.b);

    }

    public static void m2() {
        Programme03 d = new Programme03();
        System.out.println(d.a);
        System.out.println(b);
    }
}