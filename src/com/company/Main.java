package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("What's your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
        System.out.print("Please pick a number:");
        Double operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println(operand1);
        System.out.print("Great! Pick another number:");
        Double operand2 = Double.parseDouble(scanner.nextLine());
        System.out.println(operand2);

        System.out.println("Great! Your two numbers are " + operand1 + " and " + operand2 + ".");

        System.out.println("What operation would you like to do with your numbers?");
        System.out.print("Add, Subtract, Multiply, Divide, or Remainder :");
        String userOper = scanner.nextLine();

        showResults(operand1, operand2, userOper);
    }
    public static void showResults (double num1, double num2, String oper) {

        if (oper.equalsIgnoreCase("add") || oper.equals("+")) {
            double sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (oper.equalsIgnoreCase("Subtract") || oper.equals("-")) {
            double difference = num1 -  num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        } else if (oper.equalsIgnoreCase("Multiply") || oper.equalsIgnoreCase("X")  || oper.equals("*") ) {
            double multiplication = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + multiplication);
        } else if (oper.equalsIgnoreCase("Divide") || oper.equals("/")) {
            double division = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);

        } else if (oper.equalsIgnoreCase("Remainder") || oper.equals("%")) {
            int remainder = (int) num1 % (int)num2;
            System.out.println(num1 + " % " + num2 + " = " + remainder + "." );
        }
        }
    }
