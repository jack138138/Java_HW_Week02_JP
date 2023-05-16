package Java_Homework_week02;

public class Programme02 {
        // Step 2.1: Declare two static variables
        public static int variable1 = 55;
        public static int variable2 = 123;

        // Step 2.2: Declare one static method
        public static void printVariables() {
            // Step 2.3: Call both static variables into the static method inside the print statement
            System.out.println("Variable 1: " + variable1);
            System.out.println("Variable 2: " + variable2);
        }

        // Step 2.4: Declare the Main method
        public static void main(String[] args) {
            // Step 2.5: Call the static method into the Main method and run the program
            printVariables();
        }
    }
