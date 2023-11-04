package LAB1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = getValidInt("Введите размерность массива: ", 1, Integer.MAX_VALUE);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = getValidInt("Введите элемент массива #" + i + ": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        findAndPrintPrimeNumbers(array);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findAndPrintPrimeNumbers(int[] array) {
        System.out.print("Простые числа в массиве на позициях: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int getValidInt(String prompt, int minValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
        return value;
    }
}
