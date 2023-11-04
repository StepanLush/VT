package LAB1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы (n): ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Введите " + n + " действительных чисел:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double[][] matrix = createMatrix(numbers);

        System.out.println("Результирующая матрица:");
        printMatrix(matrix);

        scanner.close();
    }

    public static double[][] createMatrix(double[] numbers) {
        int n = numbers.length;
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = numbers[(i + j) % n];
            }
        }

        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
