package Lab_1;

public class LibraryCard {
    private int numberOfBilet;
    private Book bookOnHand;
    private String name;
    private String surname;
    private LibraryHall hall;

    public LibraryCard(int numberOfBilet, Book bookOnHand, String name, String surname, LibraryHall hall) {
        this.numberOfBilet = numberOfBilet;
        this.bookOnHand = bookOnHand;
        this.name = name;
        this.surname = surname;
        this.hall = hall;
    }

    public int getNumberOfBilet() {
        return numberOfBilet;
    }

    public void setNumberOfBilet(int numberOfBilet) {
        this.numberOfBilet = numberOfBilet;
    }

    public Book getBookOnHand() {
        return bookOnHand;
    }

    public void setBookOnHand(Book bookOnHand) {
        this.bookOnHand = bookOnHand;
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

    public LibraryHall getHall() {
        return hall;
    }

    public void setHall(LibraryHall hall) {
        this.hall = hall;
    }
}
