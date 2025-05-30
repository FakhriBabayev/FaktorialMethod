package az.edu.turing.həll.faktory;

import az.edu.turing.həll.format.interfacefromat.MessageFormatter;
import az.edu.turing.həll.format.XmlFormatter;
import az.edu.turing.həll.faktory.abstrac.FormatterFactory;

public class XmlFormatterFactory extends FormatterFactory {
    public MessageFormatter createFormatter() {
        return new XmlFormatter();
    }
}
