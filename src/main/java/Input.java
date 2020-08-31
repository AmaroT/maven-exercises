import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = input.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("You entered " + userInput + ", is a number");
        } else {
            System.out.println(userInput + " is not a Number");
        }

        System.out.println("Lets Swap your input: ");
        String swapInput = input.nextLine();
        System.out.println("Your input case is swapped now as: " + StringUtils.swapCase(swapInput));

        System.out.println("Now to reverse it: ");
        String reverseInput = input.nextLine();
        System.out.println("Your input is now reversed case: " + StringUtils.reverse(reverseInput));


//    Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//
//    Tells whether or not what the user entered is a number


//    Flips the case of the string


//    Reverses the string

    }
}
