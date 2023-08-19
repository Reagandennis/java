package chatbot;

import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
         // build a chatbot
         Scanner scanner = new Scanner(System.in);
            System.out.println("Hello, what is your name?");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            System.out.println("Wow, " + age + " years old!");
            System.out.println("What is your favorite food?");
            scanner.nextLine();
            String food = scanner.nextLine();
            System.out.println("I like " + food + " too!");
            System.out.println("What is your favorite color?");
            String color = scanner.nextLine();
            System.out.println("I like " + color + " too!");
            System.out.println("What is your favorite animal?");
            String animal = scanner.nextLine();
            System.out.println("I like " + animal + " too!");
            System.out.println("What is your favorite sport?");
            String sport = scanner.nextLine();
            System.out.println("I like " + sport + " too!");
            System.out.println("What is your favorite movie?");
            String movie = scanner.nextLine();
            System.out.println("I like " + movie + " too!");
    }
}
