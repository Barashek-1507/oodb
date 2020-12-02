package Lab_3;

import Lab_3.model.Book;
import Lab_3.model.Order;
import Lab_3.model.Reader;

import javax.xml.bind.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {
    public static void saveBankData(Order order) {

        try {
            JAXBContext context = JAXBContext.newInstance(Order.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(order, new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_3/order.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> sortBySerialNumber(List<Book> book) {
        Collections.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getSerial_number().compareTo(o2.getSerial_number());
            }
        });
        return book;
    }
}
