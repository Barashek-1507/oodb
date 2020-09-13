package Lab_1;

import java.util.ArrayList;

public class LibraryHall {
    private String name;
    private ArrayList<Librarian> worker = new ArrayList<>();
    private Book catalog;


    public LibraryHall(String name, Librarian worker, Book catalog, LibraryCard card) {
        this.name = name;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Librarian> getWorker() {
        return worker;
    }

    public void setWorker(ArrayList<Librarian> worker) {
        this.worker = worker;
    }

    public Book getCatalog() {
        return catalog;
    }

    public void setCatalog(Book catalog) {
        this.catalog = catalog;
    }

}
