import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        System.out.println("This is a calculator");
        System.out.println("\t\tPress 1 for Addition");
        System.out.println("\t\tPress 2 for Subtraction");
        System.out.println("\t\tPress 3 for Multiplication");
        System.out.println("\t\tPress 4 for Division");

        Scanner input = new Scanner(System.in);

        int operator=0;
        double op1=0,op2=0;
        
        try{
             operator = input.nextInt();
            System.out.println("Enter the First Operand: ");
             op1=input.nextDouble();
            System.out.println("Enter the Second Operand: ");
             op2=input.nextDouble();
        } catch (Exception e) {
            System.err.println("Please Enter a Number!");
        }

        input.close();
        
        switch (operator) {
            case 1:
                System.out.println("The Sum is "+Addition(op1,op2));
                break;
            case 2:
                System.out.println("The Subtraction is "+Subtraction(op1, op2));
                break;
            case 3:
                System.out.println("The Multiplication is "+Multiplication(op1, op2));
                break;
            case 4:
                System.out.println("The Division is "+ Division(op1, op2));
            default:
                System.out.println("Out of Range. Please re-run the program and select a number btw 1-4. ");
                break;
        }
    }

    public static double Addition(double op1, double op2) {
        return op1+op2;
    }
    public static double Subtraction(double op1, double op2) {
        return op1-op2;
    }
    public static double Multiplication(double op1, double op2) {
        return op1*op2;
    }
    public static double Division(double op1, double op2) {
        return op1/op2;
    }
}