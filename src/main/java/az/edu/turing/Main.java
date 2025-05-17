package az.edu.turing;

import az.edu.turing.həll.faktory.HtmlFormatterFactory;
import az.edu.turing.həll.faktory.JsonFormatterFactory;
import az.edu.turing.həll.faktory.XmlFormatterFactory;
import az.edu.turing.həll.faktory.abstrac.FormatterFactory;
import az.edu.turing.problem.MessageService;

public class Main {
    public static void main(String[] args) {
        MessageService service = new MessageService();

        FormatterFactory jsonFactory = new JsonFormatterFactory();
        System.out.println(service.formatMessage(jsonFactory, "Salam dünya"));

        FormatterFactory xmlFactory = new XmlFormatterFactory();
        System.out.println(service.formatMessage(xmlFactory, "Salam dünya"));

        FormatterFactory htmlFactory = new HtmlFormatterFactory();
        System.out.println(service.formatMessage(htmlFactory, "Salam dünya"));
    }
}
