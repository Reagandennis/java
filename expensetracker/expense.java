package expensetracker;

import java.util.Scanner;

public class expense {
    public static void main(String[] args) {
        // expense tracker that keeps track, manage and personal of expenses
        // allowing users to add, remove, catergorize and view expenses

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Expense Tracker!");
        System.out.println("What would you like to do?");
        System.out.println("1. Add an expense");
        System.out.println("2. Remove an expense");
        System.out.println("3. View expenses");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the expense amount: ");
                double amount = sc.nextDouble();
                System.out.println("Enter the expense category: ");
                sc.nextLine();
                String category = sc.nextLine();
                System.out.println("Enter the expense description: ");
                String description = sc.nextLine();
                System.out.println("Enter the expense date: ");
                String date = sc.nextLine();
                System.out.println("Enter the expense time: ");
                String time = sc.nextLine();
                System.out.println("Enter the expense location: ");
                String location = sc.nextLine();
                System.out.println("Enter the expense payment method: ");
                String paymentMethod = sc.nextLine();
                System.out.println("Enter the expense currency: ");
                String currency = sc.nextLine();
                System.out.println("Enter the expense receipt: ");
                String receipt = sc.nextLine();
                System.out.println("Enter the expense note: ");
                String note = sc.nextLine();
                System.out.println("Enter the expense tag: ");
                String tag = sc.nextLine();
                System.out.println("Enter the expense status: ");
                String status = sc.nextLine();
                System.out.println("Enter the expense reminder: ");
                String reminder = sc.nextLine();
                System.out.println("Enter the expense recurring: ");
                String recurring = sc.nextLine();
                System.out.println("Enter the expense recurring frequency: ");
                String recurringFrequency = sc.nextLine();
                System.out.println("Enter the expense recurring end date: ");
                String recurringEndDate = sc.nextLine();
                System.out.println("Enter the expense recurring end time: ");
                String recurringEndTime = sc.nextLine();
                System.out.println("Enter the expense recurring end number: ");
                String recurringEndNumber = sc.nextLine();
                System.out.println("Enter the expense recurring end occurence: ");
                String recurringEndOccurence = sc.nextLine();
                System.out.println("Enter the expense recurring end summary: ");
                String recurringEndSummary = sc.nextLine();
                System.out.println("Enter the expense recurring end note: ");
                String recurringEndNote = sc.nextLine();
                System.out.println("Enter the expense recurring end tag: ");
                String recurringEndTag = sc.nextLine();
                System.out.println("Enter the expense recurring end status: ");
                String recurringEndStatus = sc.nextLine();
                System.out.println("Enter the expense recurring end reminder: ");
                String recurringEndReminder = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring: ");
                String recurringEndRecurring = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring frequency: ");
                String recurringEndRecurringFrequency = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring end date: ");
                String recurringEndRecurringEndDate = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring end time: ");
                String recurringEndRecurringEndTime = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring end number: ");
                String recurringEndRecurringEndNumber = sc.nextLine();
                System.out.println("Enter the expense recurring end recurring end occurence: ");

        
    }
    


}

}  // end of class
