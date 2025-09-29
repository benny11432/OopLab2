//Working calculator project
g00462517
Ben Ryan

package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your 1st number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter your 2nd number: ");
        int secondNumber = scan.nextInt();

        int result = 0;

        System.out.println("Please pick an operation + - * /:");
        char operation =  scan.next().charAt(0);

        Calculator calc = new Calculator();
        if (operation == '+') {
            result = calc.add(firstNumber, secondNumber);
        }
        else if (operation == '-') {
            result = calc.sub(firstNumber, secondNumber);
        }
        else if (operation == '*') {
            result = calc.multiply(firstNumber,secondNumber);
        }
        else if (operation == '/') {
            if(secondNumber == 0) {
                System.out.println("Cannot divide by zero please try again");
                System.out.println("Please enter your 2nd number: ");
                secondNumber = scan.nextInt();
            }
            result = calc.divide(firstNumber,secondNumber);
        }
        else{
            System.out.println("Invalid operation!");
            return;
        }

        System.out.println("The result is: " + result);


    }



}