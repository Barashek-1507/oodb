package Lab_2;

import Lab_1.Book;
import Lab_1.Reader;
import Lab_2.LoadFiles.LoadBooks;
import Lab_2.LoadFiles.LoadReaders;
import Lab_2.SaveFiles.SaveBooks;
import Lab_2.SaveFiles.SaveReaders;
import Lab_2.Services.BookService;
import Lab_2.Services.PersonService;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            /** Чтение из файла **/
            List<Book> books = LoadBooks.loadPersonList();

            /** Вывод на экран **/
            books.forEach(System.out::println);

            /** Поиск по определенному критерию **/
            Book book = BookService.findBookByName(books, "Портрет Дориана Грея");

            /** Изменение данных **/
            if (book != null) {
                book.setPrice(5000);
            }

            /** Сохранение в новый файла **/
            SaveBooks.saveBookList(books);


            /** Чтение из файла **/
            List<Reader> readers1 = LoadReaders.loadPersonList();
            /** Вывод на экран **/
            readers1.forEach(System.out::println);
            /** Поиск по определенному критерию **/
            Reader reader = PersonService.findReaderByName(readers1, "Дмитрий");
            Reader reader2 = PersonService.findReaderBySurname(readers1, "Фуреева");
            /** Изменение данных **/
            if (reader != null) {
                reader.setPhoneNumber("+711144441");
                reader.setSurname("Иванов");
            }

            if(reader2 != null){
                reader2.setPhoneNumber("984675755");
            }
            /** Сохранение новых данных в новый файла **/
            SaveReaders.saveReaderList(readers1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}