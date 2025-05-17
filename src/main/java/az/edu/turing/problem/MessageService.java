package az.edu.turing.problem;

import az.edu.turing.həll.faktory.abstrac.FormatterFactory;
import az.edu.turing.həll.format.interfacefromat.MessageFormatter;

public class MessageService {
    public String formatMessage(String type, String message) {
        if (type.equalsIgnoreCase("json")) {
            return "{\"message\": \"" + message + "\"}";
        } else if (type.equalsIgnoreCase("xml")) {
            return "<message>" + message + "</message>";
        } else if (type.equalsIgnoreCase("html")) {
            return "<p>" + message + "</p>";
        }
        return message;
    }


    public String formatMessage(FormatterFactory factory, String message) {
        MessageFormatter formatter = factory.createFormatter();
        return formatter.format(message);
    }
}

