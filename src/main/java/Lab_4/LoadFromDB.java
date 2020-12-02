package Lab_4;

import Lab_4.Contenet.Book;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class LoadFromDB {
    public static List<Book> loadBookListFromJSONBCol(Connection connection) throws JsonSyntaxException, SQLException {
        long start = System.currentTimeMillis();

        String bookStr = "";

        PreparedStatement statement =
                connection.prepareStatement("select contentb from jtest ");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            bookStr = resultSet.getString("contentb");
            System.out.println(bookStr);
        }

        statement.close();

        Gson gson = new Gson();

        Book[] bookList = gson.fromJson(bookStr, Book[].class);

        statement =
                connection.prepareStatement("select contentb->0 as c from jtest ");

        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            bookStr = resultSet.getString("c");
            System.out.println(bookStr);
        }
        System.out.println("Чтение объекта из колонки JSONB: " + (double) (System.currentTimeMillis() - start) / 1000 + "сек ");
        return Arrays.asList(bookList);
    }

    public static List<Book> loadBookListFromJSONCol(Connection connection) throws JsonSyntaxException, SQLException {
        long start = System.currentTimeMillis();

        String bookStr = "";

        PreparedStatement statement =
                connection.prepareStatement("select content from jtest ");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            bookStr = resultSet.getString("content");
            System.out.println(bookStr);
        }

        statement.close();

        Gson gson = new Gson();

        Book[] bookList = gson.fromJson(bookStr, Book[].class);

        statement =
                connection.prepareStatement("select content->0 as c from jtest ");

        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            bookStr = resultSet.getString("c");
            System.out.println(bookStr);
        }
        System.out.println("Чтение объекта из колонки JSON: " + (double) (System.currentTimeMillis() - start) / 1000 + "сек ");
        return Arrays.asList(bookList);
    }
}
