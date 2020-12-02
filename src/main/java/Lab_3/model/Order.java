package Lab_3.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "order")
@XmlRootElement
public class Order {
    private Reader reader;
    private Book book;
    private String dataTake;
    private String dataBack;
    private Library library;
    private Librarian librarian;

    public Order() {
    }


    public Order(Reader reader, String dataTake, String dataBack, Library library, Librarian librarian, Book book) {
        this.reader = reader;
        this.dataTake = dataTake;
        this.dataBack = dataBack;
        this.library = library;
        this.librarian = librarian;
        this.book = book;
    }

    @XmlElement(name = "reader")
    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
    @XmlElement(name = "library")
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    @XmlElement(name = "dataTake")
    public String getDataTake() {
        return dataTake;
    }

    public void setDataTake(String dataTake) {
        this.dataTake = dataTake;
    }
    @XmlElement(name = "dataBack")
    public String getDataBack() {
        return dataBack;
    }

    public void setDataBack(String dataBack) {
        this.dataBack = dataBack;
    }

    @XmlElement(name = "librarian")
    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    @XmlElement(name = "bookThatOrdered")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}