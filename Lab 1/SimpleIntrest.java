import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double prin = sc.nextDouble();

        System.out.print("Enter the Rate Of Intrest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time(in Year): ");
        double time = sc.nextDouble();

        double intrest = (prin*rate*time) /100;

        System.out.print("The Simple Intrest is ="+ intrest);


    }
}
