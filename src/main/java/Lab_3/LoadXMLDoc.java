package Lab_3;
import Lab_3.model.*;

import java.io.File;
import javax.xml.bind.*;

public class LoadXMLDoc {

    public static Order loadOrderFromXML() {

        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Order) un.unmarshal(new File("/Users/maybach/Downloads/OODB_1/src/main/java/Lab_3/order.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }




    public static void main(String[] args) {
        Order order = LoadXMLDoc.loadOrderFromXML();
        System.out.println(order);
    }
}
