package Lab_1;

public class LibraryHall {
    private String name;
    private Librarian worker;
    private Book catalog;


    public LibraryHall(String name, Librarian worker, Book catalog, LibraryCard card) {
        this.name = name;
        this.worker = worker;
        this.catalog = catalog;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Librarian getWorker() {
        return worker;
    }

    public void setWorker(Librarian worker) {
        this.worker = worker;
    }

    public Book getCatalog() {
        return catalog;
    }

    public void setCatalog(Book catalog) {
        this.catalog = catalog;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }
}
