package LAB1.task8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void mergeSortedSequences() {
        double[] a1 = {1.0, 3.0, 5.0};
        double[] b1 = {2.0, 4.0, 6.0};
        Result result1 = Task8.mergeSortedSequences(a1, b1);
        double[] merged1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        List<IndexValuePair> inserted1 = result1.insertedElements;
        assertArrayEquals(merged1, result1.mergedArray);
        assertEquals(3, inserted1.size());
        assertEquals(1, inserted1.get(0).indexA);
        assertEquals(0, inserted1.get(0).indexB);
        assertEquals(2, inserted1.get(1).indexA);
        assertEquals(1, inserted1.get(1).indexB);
        assertEquals(-1, inserted1.get(2).indexA);
        assertEquals(2, inserted1.get(2).indexB);

        double[] a2 = {1.0, 2.0, 3.0};
        double[] b2 = {4.0, 5.0, 6.0};
        Result result2 = Task8.mergeSortedSequences(a2, b2);
        double[] merged2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        List<IndexValuePair> inserted2 = result2.insertedElements;
        assertArrayEquals(merged2, result2.mergedArray);
        assertEquals(3, inserted2.size());
        assertEquals(-1, inserted2.get(0).indexA);
        assertEquals(0, inserted2.get(0).indexB);
        assertEquals(-1, inserted2.get(1).indexA);
        assertEquals(1, inserted2.get(1).indexB);
        assertEquals(-1, inserted2.get(2).indexA);
        assertEquals(2, inserted2.get(2).indexB);
    }
}