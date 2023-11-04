package LAB1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void createMatrix() {
        double[] numbers1 = {1.0, 2.0, 3.0};
        double[][] expectedMatrix1 = {{1.0, 2.0, 3.0}, {2.0, 3.0, 1.0}, {3.0, 1.0, 2.0}};

        double[] numbers2 = {5.0, 0.0, -1.0, 2.0};
        double[][] expectedMatrix2 = {{5.0, 0.0, -1.0, 2.0}, {0.0, -1.0, 2.0, 5.0}, {-1.0, 2.0, 5.0, 0.0}, {2.0, 5.0, 0.0, -1.0}};

        assertArrayEquals(expectedMatrix1, Task6.createMatrix(numbers1));
        assertArrayEquals(expectedMatrix2, Task6.createMatrix(numbers2));
    }
}