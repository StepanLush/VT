package LAB1.task16;

import LAB1.task12.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleComparatorTest {

    @Test
    void compare() {
        Book book1 = new Book("Title A", "Author A", 20, 1);
        Book book2 = new Book("Title B", "Author B", 15, 2);
        Book book3 = new Book("Title A", "Author A", 25, 3);

        TitleComparator titleComparator = new TitleComparator();

        assertTrue(titleComparator.compare(book1, book2) < 0);
        assertTrue(titleComparator.compare(book2, book1) > 0);
        assertTrue(titleComparator.compare(book1, book3) == 0);

    }
}