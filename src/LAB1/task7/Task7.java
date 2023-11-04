package LAB1.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getValidInt(scanner, "Введите размерность массива: ", 1, Integer.MAX_VALUE);
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = getValidDouble(scanner, "Введите элемент массива #" + i + ": ", Double.MIN_VALUE,
                    Double.MAX_VALUE);
        }

        sortAscending(array);

        System.out.println("Отсортированный массив:");
        for (double num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void sortAscending(double[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static int getValidInt(Scanner scanner, String prompt, int minValue, int maxValue) {
        int value;

        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный формат, введите целое число.");
                scanner.next();
            }
            value = scanner.nextInt();

            if (value >= minValue && value <= maxValue) {
                break;
            } else {
                System.out.println("Значение должно быть в диапазоне от " + minValue + " до " + maxValue + ".");
            }
        } while (true);
        return value;
    }

    public static double getValidDouble(Scanner scanner, String prompt, double minValue, double maxValue) {
        double value;

        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Неверный формат, введите целое число.");
                scanner.next();
            }
            value = scanner.nextDouble();

            if (value >= minValue && value <= maxValue) {
                break;
            } else {
                System.out.println("Значение должно быть в диапазоне от " + minValue + " до " + maxValue + ".");
            }
        } while (true);
        return value;
    }
}
