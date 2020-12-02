package Lab_2.Services;

import Lab_1.Book;
import Lab_1.Reader;

import java.util.List;

public class PersonService {

    public static Reader findReaderByName(List<Reader> readers, String searchName) {
        Reader result = null;

        for (Reader reader : readers ) {
            if (reader.getName().equals(searchName)) {
                result = reader;
            }
        }

        return result;
    }

    public static Reader findReaderBySurname(List<Reader> readers, String searchSurname) {
        Reader result = null;

        for (Reader reader : readers ) {
            if (reader.getName().equals(searchSurname)) {
                result = reader;
            }
        }

        return result;
    }

}
