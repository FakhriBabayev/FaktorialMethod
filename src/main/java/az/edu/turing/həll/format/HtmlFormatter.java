package az.edu.turing.həll.format;

import az.edu.turing.həll.format.interfacefromat.MessageFormatter;

public class HtmlFormatter implements MessageFormatter {
    public String format(String message) {
        return "<p>" + message + "</p>";
    }
}