package LAB1.task14;

import LAB1.task12.Book;

public class BookClone extends Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    public static int edition;

    public BookClone(String title, String author, int price, int edition) {
        super(title, author, price, edition);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return new Book(this.title, this.author, this.price, this.edition);
    }
}
