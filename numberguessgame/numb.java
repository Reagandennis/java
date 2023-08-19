package numberguessgame;

import java.util.Random;
import java.util.Scanner;

public class numb {
    public static void main(String[] args) {
       // nummber guess game
       Scanner sc = new Scanner(System.in);
         Random rand = new Random();
            int number = rand.nextInt(100);
            int userNumber = 0;
            do {
                System.out.println("Enter a number between 1 and 100: ");
                userNumber = sc.nextInt();
                if (userNumber > number) {
                    System.out.println("Too high!");
                } else if (userNumber < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("You got it!");
                }
            } while (userNumber != number);


    }
    
}
