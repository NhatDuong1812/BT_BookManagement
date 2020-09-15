public class ProgrammingBook extends Book {
    public String language;
    public String framework;

    public ProgrammingBook(){

    }

    public ProgrammingBook(int book, String name, float price, String author, String language, String framework) {
        super(book, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", bookID=" + bookID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
