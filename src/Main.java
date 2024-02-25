import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myInt;
        double myDouble;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        myInt = input.nextInt();
        System.out.print("Please enter a double: ");
        myDouble = input.nextDouble();

        System.out.println("The double form of " + myInt + " is " + (double) myInt);
        System.out.println("The integer form of " + myDouble + " is " + (int) myDouble);
    }
}