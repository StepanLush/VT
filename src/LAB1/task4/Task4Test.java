package LAB1.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isPrime() {
        assertTrue(Task4.isPrime(2));
        assertTrue(Task4.isPrime(3));
        assertTrue(Task4.isPrime(7));
        assertTrue(Task4.isPrime(11));
        assertTrue(Task4.isPrime(13));
        assertFalse(Task4.isPrime(1));
        assertFalse(Task4.isPrime(4));
        assertFalse(Task4.isPrime(9));
        assertFalse(Task4.isPrime(15));
    }

}