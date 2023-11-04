package LAB1.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void calculateFunctionValue() {
        assertEquals(0.0, Task3.calculateFunctionValue(0), 0.001);
        assertEquals(1.557, Task3.calculateFunctionValue(1.0), 0.001);
        assertEquals(-1.557, Task3.calculateFunctionValue(-1.0), 0.001);
    }
}