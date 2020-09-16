package Lab_2;

import Lab_1.Reader;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Reader> readers = LoadDB.loadPersonList();

            readers.forEach(System.out::println);

            Reader reader = PersonService.findPersonByName(readers, "Иван");

            if (reader != null) {
                reader.setPhoneNumber("+71111111111");
                reader.setSurname("Иванов");
            }

            SaveDB.savePersonList(readers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}