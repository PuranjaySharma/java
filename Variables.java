import java.util.Scanner;

public class Variables{
    public static void main(String[] args) {
        //Declaration of variables
        int firstno;
        int secondno;
        int sum;

        //Here is input of first number
        System.out.println("Enter first number: ");
        Scanner a = new Scanner(System.in);
        firstno= a.nextInt();

        //Input of second number
        System.out.println("Enter second number: ");
        Scanner b = new Scanner(System.in);
        secondno=b.nextInt();

        //Added and save in another variable i.e. sum
        sum=firstno+secondno;
        System.out.println("Sum: "+sum);
    }

}