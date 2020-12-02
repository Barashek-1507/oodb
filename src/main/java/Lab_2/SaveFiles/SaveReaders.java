package Lab_2.SaveFiles;

import Lab_1.Book;
import Lab_1.Reader;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class SaveReaders {

    public static void saveReaderList(List<Reader> readers) throws IOException {

        if (readers != null && readers.size() > 0) {
            Gson gson = new Gson();

            String personsAsJson = gson.toJson(readers);

            System.out.println(personsAsJson);

            try (OutputStream os = new FileOutputStream(new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_2/files_of_jsons/libraryVisitors.json"))) {
                os.write(personsAsJson.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}
