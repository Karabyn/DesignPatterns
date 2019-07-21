package patterns.structural.bridge.example2.formatter;

import patterns.structural.bridge.example2.entity.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}
