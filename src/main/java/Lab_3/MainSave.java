package Lab_3;


import Lab_3.model.*;

import java.util.ArrayList;


/**
 * Пример, демонстрирующий сохранение (marshalling) объекта в XML документ
 */
public class MainSave {

    public static void main(String[] args) {
//        Создаем заказ
        Order order = new Order();
//        Создаем библиотеку, из которой будем брать книгу
        Library library = new Library();
//        Создаем библиотекаря, работающего в данной библиотеке сразу с параметрами
        Librarian librarian = new Librarian("Anita", "Zlaya");

//       Задаем параметры для библиотеку
        library.setName("Nomer 1");
        library.setWorker(librarian);

        // Создаем объект посетителей
        Reader reader = new Reader();

        // Создаем книги, которые хранятся в библиотеке
        Book book1 = new Book("93", "Гордость и предубеждение", "Джейн Эйр", 1000);
        Book book2 = new Book("35", "Война и мир", "Лев Толстой", 46447);
        Book book3 = new Book("24", "О дивный новый мир", "Олдос Хаксли", 888);
        Book book4 = new Book("8", "Вино из одуванчиков", "Рей Бредбери", 2563);
        Book book5 = new Book("02", "Портрет Дориана Грея", "Оскар Уйальд", 863);
        Book book6 = new Book("99", "Дюна", "Мэтью Герберт", 976);

        // Создаем каталог книг
        ArrayList books = new ArrayList();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        library.setBooks(books);
        //Создаем список книг у читателя
        ArrayList booksOnReader = new ArrayList();
        booksOnReader.add(book3);
        booksOnReader.add(book6);


//        Задаем параметры для читателя
        reader.setBook(booksOnReader);
        reader.setName("Дмитрий");
        reader.setSurname("Масленников");
        reader.setPhoneNumber("4363689404");


        order.setReader(reader);
        order.setLibrary(library);
        order.setDataTake("4.08.2019");
        order.setDataBack("29.04.2020");
        order.setBook(book1);


        // сохраняем объект в в XML документ
        Service.sortBySerialNumber(books);
        Service.saveBankData(order);

    }
}
