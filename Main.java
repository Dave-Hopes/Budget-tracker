
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter this months Salary. Budget maker will do the rest");
        String budget = scan.nextLine();
        int Budget = Integer.parseInt(budget);

        int needs = 50%Budget;
        int wants = 30%Budget;
        int savings = 20%Budget;

        System.out.printf("So this month you earned %s $, so you have %d $ for your rent, groceries and the rest of your bills, %d for your hobbies, restaurants and non essencial spending and finally %d $ to put into your savings account. Don't spend it all in one place", Budget, needs, wants, savings);
    }
}