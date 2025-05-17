package az.edu.turing.həll.format;

import az.edu.turing.həll.format.interfacefromat.MessageFormatter;

public class JsonFormatter implements MessageFormatter {
    public String format(String message) {
        return "{\"message\": \"" + message + "\"}";
    }
}

