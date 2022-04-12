import java.util.Scanner;

class Calc{
    public static void main(String []agrs){
        int firstnumber,secondnumber,res;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        firstnumber=sc.nextInt();
        System.out.println("Enter Number 2: ");
        secondnumber=sc.nextInt();
        System.out.println("Select Operation: + - * / ");
        op =sc.next().charAt(0);

        if (op== '+'){
            res=firstnumber+secondnumber;
            System.out.print(res);
        }
        if (op== '-'){
            res=firstnumber-secondnumber;
            System.out.print(res);
        }
        if (op== '*'){
            res=firstnumber*secondnumber;
            System.out.print(res);
        }
        if (op== '/'){
            res=firstnumber/secondnumber;
            System.out.print(res);
        }else{
            System.out.println("\nWRONG INPUT");
        }

    }


}