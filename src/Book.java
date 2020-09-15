public class Book {
    public int bookID;
    public String name;
    public float price;
    public String author;

    public Book(){

    }

    public Book(int book, String name, float price, String author) {
        this.bookID = book;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBook() {
        return bookID;
    }

    public void setBook(int book) {
        this.bookID = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book=" + bookID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
