package Lab_1;


import java.util.List;

public class Reader {
    private String name;
    private String surname;
    private String phoneNumber;
    private List<Book> book;
    Library library;

    public Reader() {
    }

    public Reader(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String showYourID(){
        return "Показал удостоверение";
    }

    public String chooseBook(List<Book> book){
        return "Я выбрал эту книгу"+book;
    }

    public List<Book> getBook(List<Book> book) {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public List<Book> returnBook(List<Book> book){
        return book;
    }

    public void sighUp(){
    }

    public void payDamaged(){

    }
}

