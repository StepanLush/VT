package LAB1.task13;


import java.util.Objects;

import LAB1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        ProgrammerBook otherBook = (ProgrammerBook) obj;

        if (!language.equals(otherBook.language)) {
            return false;
        }

        return level == otherBook.level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", edition=" + edition +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }
}


