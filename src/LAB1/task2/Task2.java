package LAB1.task2;

public class Task2 {

    public static void main(String[] args) {
        outBool(isInside(9, 2));
    }

    public static boolean isInside(int x, int y) {
        return (isPointInArea(x, y, -4, 0, 4, 4) || isPointInArea(x, y, -6, -3, 6, -3));
    }

    public static boolean isPointInArea(int x, int y, int minX, int minY, int maxX, int maxY) {
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    public static void outBool(boolean result) {
        System.out.println(result);
    }
}
