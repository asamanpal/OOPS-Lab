//Wap to add 2 no.

import java.util.Scanner;

public class _1_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print("The Additions  of two number is :" + sum);
    }
}


//OUTPUT

//Enter Your First Number:23
//Enter the second number:13
//The Additions of two number is :36