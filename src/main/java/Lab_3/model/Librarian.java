package Lab_3.model;


import javax.xml.bind.annotation.XmlElement;


public class Librarian {
    private String name;
    private String surname;

    public Librarian() {
    }

    public Librarian(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
