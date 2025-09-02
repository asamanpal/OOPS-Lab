// Write a Java program to multiply two given matrices.

public class MatrixMultiply2x2 {
    public static void main(String[] args) {
        // Matrix A
        int[][] A = {
                { 1, 2 },
                { 3, 4 }
        };

        // Matrix B
        int[][] B = {
                { 5, 6 },
                { 7, 8 }
        };

        // Result matrix
        int[][] C = new int[2][2];

        // Multiply A and B
        for (int i = 0; i < 2; i++) { // Row loop
            for (int j = 0; j < 2; j++) { // Column loop
                for (int k = 0; k < 2; k++) { // Inner multiplication loop
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result Matrix C:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


