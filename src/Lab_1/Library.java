package Lab_1;

import java.util.List;

public class Library {
    private List<LibraryHall> allHalls;

    public Library(List<LibraryHall> allHalls) {
        this.allHalls = allHalls;
    }

    public List<LibraryHall> getAllHalls() {
        return allHalls;
    }

    public void setAllHalls(List<LibraryHall> allHalls) {
        this.allHalls = allHalls;
    }


}
