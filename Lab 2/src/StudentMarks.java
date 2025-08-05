import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentMarks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of subjects: ");
        int n = Integer.parseInt(br.readLine());

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Enter Marks of Subject " + (i+ 1) + ": ");
            marks[i] = Integer.parseInt(br.readLine());
            total += marks[i];
        }

        int exTotal = n*100;

        double percentage = (double) total / n ;
        System.out.println("Total Marks: " + total);
        System.out.print("Percentage: " + percentage + "%");
    }
}


//OUTPUT
//
//
//Enter number of subjects: 6
//Enter Marks of Subject 1: 98
//Enter Marks of Subject 2: 96
//Enter Marks of Subject 3: 90
//Enter Marks of Subject 4: 95
//Enter Marks of Subject 5: 99
//Enter Marks of Subject 6: 100
//Total Marks: 578
//Percentage: 96.33333333333333%