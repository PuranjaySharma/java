import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        int firstno,secondno,sum;

        System.out.println("Enter first number: ");
        Scanner objA=new Scanner(System.in);
        firstno=objA.nextInt();

        System.out.println("Enter second number: ");
        Scanner objB=new Scanner(System.in);
        secondno=objB.nextInt();

        sum=firstno+secondno;

        System.out.println("Sum: "+sum);
    }
}
