import java.util.Scanner;

/**
 * calculator
 */
public class calculator {
    private static
    int n;
    private int num1;
    private int num2;
    private int res;
    public
    // menu options for the user to choose from. It displays the following options:
    static void display()
    {
        System.out.println("Enter '1' for Addition");
        System.out.println("Enter '2' for Subtraction");
        System.out.println("Enter '3' for Multiplication");
        System.out.println("Enter '4' for Division");
        System.out.println("Enter '5' for Exit");
    }
    /*
    The function `input1` reads an integer input from the user using the Scanner class in Java.
     */
    int input1()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    /**
     * The `addn` function in Java takes two integer parameters and returns their sum.
     */
    int addn(int num1,int num2)
    {
        return num1+num2;
    }

    /**
     * This Java function subtracts the second number from the first number and returns the result.
     * @return The function `subtraction` is returning the result of subtracting `num2` from `num1`.
     */
    int subtraction(int num1,int num2)
    {
        return num1-num2;
    }
    /**
    * The function "multiplication" takes two integers as input and returns their product.
    * @return The function `multiplication` returns the result of multiplying `num1` and `num2`.
    */
    int multiplication(int num1,int num2)
    {
        return num1*num2;
    }
    /**
     * The `division` function in Java attempts to divide two numbers and handles the exception for
     * division by zero by printing a message and returning 000.
     * 
     * @param num1 An integer representing the numerator of the division operation.
     * @param num2 It seems like you were about to ask for the value of `num2` in the `division`
     * method. If you provide me with the value of `num2`, I can help you with the division operation.
     * @return The division method is returning the result of dividing num1 by num2. If an exception
     * occurs (such as dividing by zero), it will catch the exception, print "Cannot divided by zero",
     * and return 000.
     */
    int division(int num1,int num2)
    {
        try {
            return num1/num2;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Cannot divided by zero");
            
            return 000;
        }
        
    }
    public static void main(String[] args) throws ArithmeticException{
        calculator c=new calculator();
        c.display();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int num1,num2,result=0;
        // The code snippet `if (n==1 || n==2 || n==3|| n==4 || n==5) {` is checking the value of the
        // variable `n` to see if it matches any of the numbers 1, 2, 3, 4, or 5. If `n` matches any of
        // these values, it prompts the user to enter the first number, reads the input using the
        // `input1()` method, then prompts the user to enter the second number and reads that input as
        // well. This is part of the logic to handle different operations based on the user's choice in
        // the calculator program.
        if (n==1 || n==2 || n==3|| n==4 || n==5) {
        System.out.println("Enter 1st number");
        num1= c.input1();
        System.out.println("Enter the second number");
        num2=c.input1();
        // The `switch (n)` statement in the code snippet you provided is a control flow statement in
        // Java that allows the program to execute different blocks of code based on the value of the
        // variable `n`. Here's a breakdown of what each case does:
        switch (n) {
            case 1:
                result=c.addn(num1,num2);
                break;
            case 2:
                result=c.subtraction(num1,num2);
                break;
            case 3:
                result=c.multiplication(num1,num2);
                break;
            case 4:
                result=c.division(num1,num2);
                break;
            default:
            System.out.println("exit");
                System.exit(0);
                
                break;
        }
        System.out.println("result="+result);
            
    }
    else
    System.out.println("Wrong input ");
    System.exit(0);
}
}