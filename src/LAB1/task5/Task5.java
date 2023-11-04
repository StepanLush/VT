package LAB1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getValidInt(scanner, "Введите размерность массива: ", 1, Integer.MAX_VALUE);
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = getValidInt(scanner, "Введите элемент массива #" + i + ": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        int k = findMinRemovals(A);
        System.out.println("Наименьшее число K элементов, которые можно выкинуть: " + k);

        scanner.close();
    }

    public static int findMinRemovals(int[] A) {
        int n = A.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }

        return n - maxLen;
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
}
