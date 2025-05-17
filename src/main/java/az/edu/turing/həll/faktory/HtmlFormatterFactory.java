package az.edu.turing.həll.faktory;

import az.edu.turing.həll.format.HtmlFormatter;
import az.edu.turing.həll.format.interfacefromat.MessageFormatter;
import az.edu.turing.həll.faktory.abstrac.FormatterFactory;

public class HtmlFormatterFactory extends FormatterFactory {
    public MessageFormatter createFormatter() {
        return new HtmlFormatter();
    }
}
