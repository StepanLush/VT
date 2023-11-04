package LAB1.task12;

public class Book {
        private String title;
        private String author;
        private int price;
        public static int edition;

        public Book(String title, String author, int price, int edition) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.edition = edition;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPrice() {
            return price;
        }

        public int getEdition() {
            return edition;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Book otherBook = (Book) obj;

            if (price != otherBook.price) {
                return false;
            }

            if (!title.equals(otherBook.title)) {
                return false;
            }

            if (!author.equals(otherBook.author)) {
                return false;
            }

            return edition == otherBook.edition;
        }

        @Override
        public int hashCode() {
            int result = title.hashCode();
            result = 31 * result + author.hashCode();
            result = 31 * result + price;
            result = 31 * result + edition;
            return result;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    ", edition=" + edition +
                    '}';
        }

    public void setTitle(String newTitle) {
            this.title = newTitle;
    }
}


