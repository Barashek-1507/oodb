package Lab_2.Services;

import Lab_1.Book;

import java.util.List;

public class BookService {

    public static Book findBookByName(List<Book> books, String searchName) {
        Book result = null;

        for (Book book : books ) {
            if (book.getName().equals(searchName)) {
                result = book;
            }
        }
        return result;
    }

    public static Book findBookByAuthor(List<Book> books, String searchAuthor) {
        Book result = null;

        for (Book book : books ) {
            if (book.getAuthor().equals(searchAuthor)) {
                result = book;
            }
        }
        return result;
    }

    public static Book findBookByPrice(List<Book> books, Integer price) {
        Book result = null;

        for (Book book : books ) {
            if (book.getPrice() == price) {
                result = book;
            }
        }
        return result;
    }
}
