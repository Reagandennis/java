package calculator;

import java.util.Scanner;
// calculator complete
public class calc {
    public static void main(String[] args) {    
        System.out.println("Hello, world!");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("Enter the operation: ");
            char op = sc.next().charAt(0);
      
            int result = 0;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
            }
            
            System.out.println("The result is: " + result);
        }
    }
    
}
