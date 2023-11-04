package LAB1.task16;
import LAB1.task12.Book;

import java.util.Comparator;
public class TitleAuthorComparator extends TitleComparator{
    @Override
    public int compare(Book o1, Book o2) {
        int nameCompare = super.compare(o1, o2);
        return (nameCompare == 0) ? String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthor(), o2.getAuthor()) : nameCompare;
    }
}
