package Lab_2.SaveFiles;

import Lab_1.Book;
import Lab_1.Reader;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class SaveBooks {
    public static void saveBookList(List<Book> books) throws IOException {

        if (books != null && books.size() > 0) {
            Gson gson = new Gson();

            String booksAsJson = gson.toJson(books);

            System.out.println(booksAsJson);

            try (OutputStream os = new FileOutputStream(new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_2/files_of_jsons/orderBooks.json"))) {
                os.write(booksAsJson.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}
