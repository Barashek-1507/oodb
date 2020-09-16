package Lab_1;

import javax.xml.crypto.Data;

public class Order {
    private String name;
    private Data dataTake;
    private Data dataBack;
    private LibraryHall libraryHall;
    private Librarian librarian;

    public Order(String name, Data dataTake, Data dataBack, LibraryHall libraryHall, Librarian librarian) {
        this.name = name;
        this.dataTake = dataTake;
        this.dataBack = dataBack;
        this.libraryHall = libraryHall;
        this.librarian = librarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LibraryHall getLibraryHall() {
        return libraryHall;
    }

    public void setLibraryHall(LibraryHall libraryHall) {
        this.libraryHall = libraryHall;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
