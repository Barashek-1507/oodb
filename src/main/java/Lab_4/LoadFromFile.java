package Lab_4;

import Lab_4.Contenet.Book;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadFromFile {
    public static List<Book> loadPersonList() throws IOException, JsonSyntaxException {
        String booksString = "";
        File file1 = new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_2/files_of_jsons/books.json");

        if (file1.exists()) {
            booksString = new String(Files.readAllBytes(file1.toPath()));
        } else {
            System.out.println("File books.json not found!");
        }

        Gson gson = new Gson();

        Book[] booksList = gson.fromJson(booksString, Book[].class);


        return Arrays.asList(booksList);
    }
}
