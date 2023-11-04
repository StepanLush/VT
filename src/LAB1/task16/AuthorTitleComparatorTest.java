package LAB1.task16;

import LAB1.task12.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTitleComparatorTest {

    @Test
    void compare() {
        Book book1 = new Book("Title A", "Author A", 20, 1);
        Book book2 = new Book("Title A", "Author B", 15, 2);
        Book book3 = new Book("Title B", "Author A", 25, 3);
        Book book4 = new Book("Title B", "Author B", 30, 4);

        AuthorTitleComparator authorTitleComparator = new AuthorTitleComparator();


        assertTrue(authorTitleComparator.compare(book1, book2) < 0);
        assertTrue(authorTitleComparator.compare(book2, book1) > 0);
        assertTrue(authorTitleComparator.compare(book1, book3) < 0);

        assertTrue(authorTitleComparator.compare(book1, book4) < 0);
        assertTrue(authorTitleComparator.compare(book2, book4) < 0);


    }
}