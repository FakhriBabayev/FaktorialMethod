package az.edu.turing.həll.faktory;

import az.edu.turing.həll.format.JsonFormatter;
import az.edu.turing.həll.format.interfacefromat.MessageFormatter;
import az.edu.turing.həll.faktory.abstrac.FormatterFactory;

public class JsonFormatterFactory extends FormatterFactory {
    public MessageFormatter createFormatter() {
        return new JsonFormatter();
    }
}