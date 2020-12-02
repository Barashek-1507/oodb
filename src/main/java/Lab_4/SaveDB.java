package Lab_4;

import Lab_4.Contenet.Book;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SaveDB {

    public static void savePersonList(List<Book> books, Connection connection) throws SQLException {
        long start = System.currentTimeMillis();

        if (books != null && books.size() > 0) {
            Gson gson = new Gson();

            String booksAsJson = gson.toJson(books);

            PreparedStatement statement = connection.
                    prepareStatement("insert into jtest (content, contentb) values ( cast( ? as json) , cast( ? as json) )");
            statement.setString(1, booksAsJson);
            statement.setString(2, booksAsJson);

            int count = statement.executeUpdate();

            System.out.println(count + " records added!");

            statement.close();

            System.out.println("Запись объектов: " + (double) (System.currentTimeMillis() - start) / 1000 + "сек ");

        }
    }
}
