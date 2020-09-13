package Lab_1;

public class Book {
    private String serial_number;
    private String name;
    private String author;
    private int price;

    public Book(String serial_number, String name, String author, int price){
        this.serial_number = serial_number;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int change_price(int new_price){
        return new_price;
    }
}
