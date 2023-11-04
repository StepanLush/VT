package LAB1.task5;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void findMinRemovals() {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {5, 2, 7, 3, 4, 8, 6};
        int[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array4 = {1, 2, 3, 4, 5};

        assertEquals(0, Task5.findMinRemovals(array1));
        assertEquals(3, Task5.findMinRemovals(array2));
        assertEquals(8, Task5.findMinRemovals(array3));
        assertEquals(0, Task5.findMinRemovals(array4));
    }

    @Test
    void getValidInt() {
        Scanner scanner = new Scanner("5\n");
        assertEquals(5, Task5.getValidInt(scanner, "Enter a number: ", 1, 10));
    }
}