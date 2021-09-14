//From 10.2 Exception with Methods
// BMI Exception Handling

import java.util.Scanner;

public class BMIExceptionHandling {
    public static int getWeight(Scanner scan) throws Exception {
        int weightParam; // user defined weight in lbs.

        // Get user data
        System.out.println("Enter weight in pounds: ");
        weightParam = scan.nextInt();

        // Error checking, non-negative weight
        if (weightParam < 0) {
            throw new Exception("Invalid weight.");
        }
        return weightParam;
    }

    public static int getHeight(Scanner scan) throws Exception {
        int heightParam; // user defined - height in inches

        // Get user data
        System.out.println("Enter height in inches: ");
        heightParam = scan.nextInt();

        // error checking, non-negative height
        if (heightParam < 0) {
            throw new Exception("Invalid height.");
        }
        return heightParam;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight; // user defined wt.
        int height; // user defined ht.
        float bmiCalc; // resulting BMI
        char quitCmd; // indicates quit/continue

        quitCmd = 'a';

        while (quitCmd != 'q') {
            try {
                //get user data
                weight = getWeight(scan);
                height = getHeight(scan);
            
            // calculate BMI & print user health info if no
            // input error
            bmiCalc = ((float) weight/(float) (height * height)) * 703.0f;
            System.out.println("BMI: " + bmiCalc);
            System.out.println("(CDC: 18.6 - 24.9 normal)");
            } catch (Exception excpt) {
                // prints the error msg passed by throw statement
            System.out.println(excpt.getMessage());
            System.out.println("Cannot compute health info");
            }

            // Prompt user to continue or quit
            System.out.print("\nEnter any key ('q' to quit): ");
            quitCmd = scan.next().charAt(0);
        }
    }
}




