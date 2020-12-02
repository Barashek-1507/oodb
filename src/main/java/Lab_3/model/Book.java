package Lab_3.model;

import javax.xml.bind.annotation.XmlElement;

public class Book {
    private String serial_number;
    private String name;
    private String author;
    private int price;

    public Book(){}

    public Book(String serial_number, String name, String author, int price) {
        this.serial_number = serial_number;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @XmlElement(name = "serial_number")
    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serial_number='" + serial_number + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}