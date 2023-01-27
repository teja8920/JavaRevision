import java.util.Scanner;

public class ComparingNumbAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first Number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Second Number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if(firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger than " + secondNumber);
        } else if(secondNumber > firstNumber) {
            System.out.println(secondNumber + " is larger than " + firstNumber);
        } else {
            System.out.println(secondNumber + " = " + firstNumber);
        }

        int sum = firstNumber + secondNumber;
        System.out.println("Sum of both the numbers is: " + sum);
    }
}
