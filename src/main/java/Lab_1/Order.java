package Lab_1;

import javax.xml.crypto.Data;

public class Order {
    private Reader reader;
    private Data dataTake;
    private Data dataBack;
    private Library library;
    private Librarian librarian;

    public Order(Reader reader, Data dataTake, Data dataBack, Library library, Librarian librarian) {
        this.reader = reader;
        this.dataTake = dataTake;
        this.dataBack = dataBack;
        this.library = library;
        this.librarian = librarian;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Data getDataTake() {
        return dataTake;
    }

    public void setDataTake(Data dataTake) {
        this.dataTake = dataTake;
    }

    public Data getDataBack() {
        return dataBack;
    }

    public void setDataBack(Data dataBack) {
        this.dataBack = dataBack;
    }


    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
