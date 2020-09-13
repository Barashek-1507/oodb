package Lab_1;

import java.util.ArrayList;

public class Reader {
    private String name;
    private String surname;
    private String phoneNumber;
    ArrayList<Book> book = new ArrayList<>();
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

    public String chooseBook(ArrayList<Book> book){
        return "Я выбрал эту книгу"+book;
    }

    public ArrayList<Book> getBook(ArrayList<Book> book) {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public ArrayList<Book> returnBook(ArrayList<Book> book){
        return book;
    }

    public void sighUp(){
    }

    public void payDamaged(){

    }
}

