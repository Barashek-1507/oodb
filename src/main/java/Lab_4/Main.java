package Lab_4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            Class.forName("org.postgresql.Driver");
            String dbURL = "jdbc:postgresql://localhost:5433/postgres";
            Connection connection =
                    DriverManager.getConnection(dbURL, "postgres", "27071976");

            LoadFromDB.loadBookListFromJSONBCol(connection);
            LoadFromDB.loadBookListFromJSONCol(connection);
//            List<Book> books = LoadFromFile.loadPersonList();
//            SaveDB.savePersonList(books, connection);


            connection.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        }
    }

}
