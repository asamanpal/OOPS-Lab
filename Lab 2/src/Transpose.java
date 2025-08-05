// Display element of a 2-D array in form of matrix and also print it's transpose.


import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter no of columns: ");
        int clo = sc.nextInt();

        int[][] matrix = new int[row][clo];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                System.out.print("Element [" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n Original Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clo; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n Transpose of the Matrix:");
        for (int i = 0; i < clo; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}


//OUTPUT
//
//Enter no of rows: 3
//Enter no of columns: 3
//Enter the elements of the matrix:
//Element [0][0]:2
//Element [0][1]:3
//Element [0][2]:5
//Element [1][0]:6
//Element [1][1]:7
//Element [1][2]:8
//Element [2][0]:9
//Element [2][1]:7
//Element [2][2]:6
//
//Original Matrix:
//        2	3 5
//        6	7 8
//        9	7 6
//
//Transpose of the Matrix:
//        2	6 9
//        3	7 7
//        5	8 6