package Lab_1;

public class Librarian {
    private String name;
    private String surname;
    private String position;
    private Library workPlace;

    public Librarian(String name, String surname, String position, Library workPlace) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.workPlace = workPlace;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Library getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(Library workPlace) {
        this.workPlace = workPlace;
    }
}
