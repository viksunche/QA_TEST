package automation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("Please enter your first name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        //System.out.println("Your name is: " + name);

        System.out.println(" Please enter your age: ");

        int userAge = scanner.nextInt();

        System.out.println(" Your name is: " + name +  "\nYour age is: " + userAge);

        if (userAge >= 18 ) {

            System.out.println( name + " User can drink alcohol legally.");
        }

        if (userAge < 18 ) {

            System.out.println( name + " User can drink milk.");
        }

    }
}
