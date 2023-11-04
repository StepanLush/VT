package LAB1.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void sortAscending() {
        double[] array1 = {3.0, 1.0, 5.0, 2.0, 4.0};
        double[] expectedArray1 = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] array2 = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expectedArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] array3 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expectedArray3 = {1.0, 2.0, 3.0, 4.0, 5.0};

        Task7.sortAscending(array1);
        assertArrayEquals(expectedArray1, array1);

        Task7.sortAscending(array2);
        assertArrayEquals(expectedArray2, array2);

        Task7.sortAscending(array3);
        assertArrayEquals(expectedArray3, array3);
    }
}