package Lab_1;

import java.util.List;

public class Library {
    private String name;
    private List<Librarian> worker;
    private Book catalog;

    public Library() {}

    public Library(String name, List<Librarian> worker, Book catalog) {
        this.name = name;
        this.worker = worker;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Librarian> getWorker() {
        return worker;
    }

    public void setWorker(List<Librarian> worker) {
        this.worker = worker;
    }

    public Book getCatalog() {
        return catalog;
    }

    public void setCatalog(Book catalog) {
        this.catalog = catalog;
    }
}
