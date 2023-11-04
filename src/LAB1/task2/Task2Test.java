package LAB1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void isInside() {
        assertTrue(Task2.isInside(0, 0));
        assertFalse(Task2.isInside(9, 2));
        assertTrue(Task2.isInside(4, 4));
        assertFalse(Task2.isInside(7, 0));
        assertTrue(Task2.isInside(0, -3));
        assertFalse(Task2.isInside(6, 1)); //
    }

    @Test
    void isPointInArea() {
        assertTrue(Task2.isPointInArea(0, 0, -4, 0, 4, 4));
        assertTrue(Task2.isPointInArea(0, -3, -6, -3, 6, -3));
        assertFalse(Task2.isPointInArea(5, 0, -4, 0, 4, 4));
        assertFalse(Task2.isPointInArea(0, 1, -6, -3, 6, -3));
    }
}