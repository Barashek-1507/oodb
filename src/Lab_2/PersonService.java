package Lab_2;

import Lab_1.Reader;

import java.util.List;

/**
 *  Класс сервисных методов для работы с данными
 */
public class PersonService {

    /**
     * Поиск по имени
     */
    public static Reader findPersonByName(List<Reader> readers, String searchName) {
        Reader result = null;

        for (Reader reader : readers) {
            if (reader.getName().equals(searchName)) {
                result = reader;
            }
        }

        return result;
    }

}
