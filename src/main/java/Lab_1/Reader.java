package Lab_1;


import java.util.List;

public class Reader {
    private String name;
    private String surname;
    private String phoneNumber;
    private List<Book> book;
//    private Library library;

    public Reader(){}

    public Reader(String name, String surname, String phoneNumber, List<Book> book, Library library) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.book = book;
//        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBook() {
        return book;
    }

//    public Library getLibrary() {
//        return library;
//    }
//
//    public void setLibrary(Library library) {
//        this.library = library;
//    }

    public List<Book> getBook(List<Book> book) {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }


    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", book=" + book +
//                ", library=" + library +
                '}';
    }
}

