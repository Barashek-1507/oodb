package Lab_2.LoadFiles;

import Lab_1.Reader;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadReaders {
    public static List<Reader> loadPersonList() throws IOException, JsonSyntaxException {
        String readerString = "";
        File file1 = new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_2/files_of_jsons/readers.json");

        if (file1.exists()) {
            readerString = new String(Files.readAllBytes(file1.toPath()));
        } else {
            System.out.println("File readers.json not found!");
        }

        Gson gson = new Gson();

        Reader[] readersList = gson.fromJson(readerString, Reader[].class);


        return Arrays.asList(readersList);
    }
}
