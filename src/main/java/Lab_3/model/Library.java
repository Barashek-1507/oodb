package Lab_3.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Library {
    private String name;
    private Librarian worker;
    private List<Book> books;

    public Library() {}

    public Library(String name, Librarian worker, List<Book> books) {
        this.name = name;
        this.worker = worker;
        this.books = books;
    }
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "librarianWhoWorksThere")
    public Librarian getWorker() {
        return worker;
    }

    public void setWorker(Librarian worker) {
        this.worker = worker;
    }

    @XmlElementWrapper(name = "books")
    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
