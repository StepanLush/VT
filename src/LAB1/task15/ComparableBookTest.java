package LAB1.task15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparableBookTest {

    @Test
    void compareTo() {
        ComparableBook book1 = new ComparableBook("Book A", "Author A", 20, 1, 12345);
        ComparableBook book2 = new ComparableBook("Book B", "Author B", 15, 2, 54321);
        ComparableBook book3 = new ComparableBook("Book C", "Author C", 25, 3, 67890);

        assertTrue(book1.compareTo(book2) < 0);
        assertTrue(book2.compareTo(book1) > 0);
        assertEquals(0, book2.compareTo(book2));

        assertThrows(NullPointerException.class, () -> book1.compareTo(null));
    }
}