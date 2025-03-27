import java.util.Scanner;

public class UserInputs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Expense Tracker");

        System.out.println("Please enter the number of Incomes and Expenses (Press Enter once finished with an input): ");
        int incomes = in.nextInt();
        int expenses = in.nextInt();

    }
}