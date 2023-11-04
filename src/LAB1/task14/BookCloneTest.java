package LAB1.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookCloneTest {

    @Test
    void testClone() {
        BookClone originalBook = new BookClone("The Great Gatsby", "F. Scott Fitzgerald", 15, 1);

        try {
            BookClone clonedBook = (BookClone) originalBook.clone();

            assertNotSame(originalBook, clonedBook);

            assertEquals(originalBook.getTitle(), clonedBook.getTitle());
            assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
            assertEquals(originalBook.getPrice(), clonedBook.getPrice());
            assertEquals(originalBook.getEdition(), clonedBook.getEdition());

            clonedBook.setTitle("New Title");
            assertNotEquals(originalBook.getTitle(), clonedBook.getTitle());

        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not occur");
        }
    }
}