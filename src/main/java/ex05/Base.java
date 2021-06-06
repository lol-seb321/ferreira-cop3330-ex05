package ex05;

/*
Exercise 5 - Simple Math

You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll
have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers
as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */

import java.util.Scanner;

public class Base {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Base myBase = new Base();

        String input1 = myBase.inputFirstNum();
        String input2 = myBase.inputSecondNum();

        int convertFirstNum = Integer.parseInt(input1);
        int convertSecondNum = Integer.parseInt(input2);

        myBase.addNumValues(convertFirstNum, convertSecondNum);
        myBase.subtractNumValues(convertFirstNum, convertSecondNum);
        myBase.multiplyNumValues(convertFirstNum, convertSecondNum);
        myBase.divideNumValues(convertFirstNum, convertSecondNum);
    }

    private void divideNumValues(int convertFirstNum, int convertSecondNum) {
        int divide = convertFirstNum / convertSecondNum;
        System.out.print(convertFirstNum + " / " + convertSecondNum + " = ");
        System.out.println(divide);
    }

    private void multiplyNumValues(int convertFirstNum, int convertSecondNum) {
        int multiply = convertFirstNum * convertSecondNum;
        System.out.print(convertFirstNum + " * " + convertSecondNum + " = ");
        System.out.println(multiply);
    }

    private void subtractNumValues(int convertFirstNum, int convertSecondNum) {
        int subtract = convertFirstNum - convertSecondNum;
        System.out.print(convertFirstNum + " - " + convertSecondNum + " = ");
        System.out.println(subtract);
    }

    private void addNumValues(int convertFirstNum, int convertSecondNum) {
        int sum = convertFirstNum + convertSecondNum;
        System.out.print(convertFirstNum + " + " + convertSecondNum + " = ");
        System.out.println(sum);
    }


    private String inputSecondNum() {
        System.out.print("What is the second number? ");
        String num_second = input.nextLine();
        return num_second;
    }

    private String inputFirstNum() {
        System.out.print("What is the first number? ");
        String num_first = input.nextLine();
        return num_first;
    }


}
