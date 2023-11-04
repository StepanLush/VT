package LAB1.task1;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void testcalculateForm1() {
        double x = 3;
        double y = 4;

        double expected = ((1 + Math.pow(Math.sin(x + y), 2))
                / (2 + Math.abs(x - ((2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)))))) + x;

        double result = Task1.calculateForm(x, y);

        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void testcalculateForm2() {
        double x = -1.5;
        double y = 353155;

        double expected = ((1 + Math.pow(Math.sin(x + y), 2))
                / (2 + Math.abs(x - ((2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)))))) + x;

        double result = Task1.calculateForm(x, y);

        assertEquals(expected, result, 0.0001);
    }
}