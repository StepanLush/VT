package LAB1.task15;

import java.util.Comparator;

import LAB1.task12.Book;

public class ComparableBook extends Book implements Comparable<ComparableBook> {
    public int isbn;

    ComparableBook(String title, String author, int price, int edition, int isbn) {
        super(title, author, price, edition);
        this.isbn = isbn;
    }

    @Override
    public int compareTo(ComparableBook o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return Integer.compare(this.isbn, o.isbn);
    }

}
