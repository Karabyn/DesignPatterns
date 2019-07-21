package patterns.structural.bridge.example2.printer;

import patterns.structural.bridge.example2.entity.Detail;
import patterns.structural.bridge.example2.formatter.Formatter;

import java.util.List;

public abstract class Printer {

    // composition
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();

}
