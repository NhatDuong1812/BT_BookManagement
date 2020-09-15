public class FictionBook extends Book {
    public String category;

    public FictionBook(){

    }

    public FictionBook(int book, String name, float price, String author, String category) {
        super(book, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", bookID=" + bookID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
