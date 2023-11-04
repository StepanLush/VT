package LAB1.task3;

import java.util.Formatter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getValidDouble(scanner, "Введите начало отрезка 'a': ", 0);
        double b = getValidDouble(scanner, "Введите конец отрезка 'b': ", a + Double.MIN_VALUE);
        double h = getValidDouble(scanner, "Введите шаг 'h': ", Double.MIN_VALUE);

        scanner.close();
        printFunctionTable(a, b, h);
    }

    public static double getValidDouble(Scanner scanner, String prompt, double minValue) {
        double value;

        do {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= minValue) {
                break;
            } else {
                System.out.println("Значение должно быть больше или равно " + minValue);
            }
        } while (true);

        return value;
    }

    public static void printFunctionTable(double a, double b, double h) {
        System.out.println("  x  | F(x)");

        for (double x = a; x <= b; x += h) {
            double result = calculateFunctionValue(x);
            printFormattedRow(x, result);
        }
    }

    public static double calculateFunctionValue(double x) {
        return Math.tan(x);
    }

    public static void printFormattedRow(double x, double result) {
        try (Formatter formatter = new Formatter()) {
            formatter.format("%.2f | %.2f", x, result);
            System.out.println(formatter);
        }
    }
}
