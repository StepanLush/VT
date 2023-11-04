package LAB1.task1;

public class Task1 {

    public static void main(String[] args) {
        outDouble(calculateForm(3, 4));
    }

    public static double calculateForm(double x, double y) {
        return ((1 + Math.pow(Math.sin(x + y), 2))
                / (2 + Math.abs(x - ((2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)))))) + x;
    }

    public static void outDouble(double num) {
        System.out.printf("%f", num);
    }

}
