package LAB1.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность последовательности a: ");
        int n = getValidInt(scanner);

        double[] a = new double[n];
        System.out.println("Введите элементы последовательности a (неубывающей):");
        for (int i = 0; i < n; i++) {
            a[i] = getValidDouble(scanner);
        }

        System.out.print("Введите размерность последовательности b: ");
        int m = getValidInt(scanner);

        double[] b = new double[m];
        System.out.println("Введите элементы последовательности b (неубывающей):");
        for (int i = 0; i < m; i++) {
            b[i] = getValidDouble(scanner);
        }

        Result result = mergeSortedSequences(a, b);

        System.out.println("Объединенная последовательность:");
        for (double num : result.mergedArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nИндексы вставленных элементов из последовательности b в последовательность a:");
        for (IndexValuePair indexValuePair : result.insertedElements) {
            System.out.println("Индекс в a: " + indexValuePair.indexA + ", Индекс в b: " + indexValuePair.indexB);
        }

        scanner.close();
    }

    public static Result mergeSortedSequences(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        double[] mergedArray = new double[n + m];
        Result result = new Result();

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                mergedArray[k++] = a[i++];
            } else {
                mergedArray[k++] = b[j];
                result.insertedElements.add(new IndexValuePair(i, j));
                j++;
            }
        }

        while (i < n) {
            mergedArray[k++] = a[i++];
        }

        while (j < m) {
            mergedArray[k++] = b[j];
            result.insertedElements.add(new IndexValuePair(-1, j));
            j++;
        }

        result.mergedArray = mergedArray;

        return result;
    }

    public static int getValidInt(Scanner scanner) {
        int value;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный формат, введите целое число.");
                scanner.next();
            }
            value = scanner.nextInt();

            if (value > 0) {
                break;
            } else {
                System.out.println("Значение должно быть положительным.");
            }
        } while (true);

        return value;
    }

    public static double getValidDouble(Scanner scanner) {
        double value;

        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Неверный формат, введите действительное число.");
                scanner.next();
            }
            value = scanner.nextDouble();
            break;
        } while (true);

        return value;
    }
}

class Result {
    double[] mergedArray;
    List<IndexValuePair> insertedElements = new ArrayList<>();
}

class IndexValuePair {
    int indexA;
    int indexB;

    public IndexValuePair(int indexA, int indexB) {
        this.indexA = indexA;
        this.indexB = indexB;
    }
}