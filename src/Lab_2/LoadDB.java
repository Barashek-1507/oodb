package Lab_2;

import Lab_1.Library;
import Lab_1.Reader;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadDB {

    public static Library load() throws IOException {
        Library library = null;
        String bankStr = "";
        File file = new File("bank.json");

        if (file.exists()) {
            bankStr = new String(Files.readAllBytes(file.toPath()));
        }

        library = new Gson().fromJson(bankStr, Library.class);

        return library;
    }

    /**
     * Пример чтения из файла массива JSON объектов
     */
    public static List<Reader> loadPersonList() throws IOException, JsonSyntaxException {
        String readerString = "";
        File file = new File("persons.json");

        if (file.exists()) {
            readerString = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }

        Gson gson = new Gson();

        Reader[] readerList = gson.fromJson(readerString, Reader[].class);

        return Arrays.asList(readerList);
    }
}
