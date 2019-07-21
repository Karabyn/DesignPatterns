package patterns.structural.bridge.example2;

import patterns.structural.bridge.example2.entity.Movie;
import patterns.structural.bridge.example2.formatter.Formatter;
import patterns.structural.bridge.example2.formatter.HtmlFormatter;
import patterns.structural.bridge.example2.formatter.PrintFormatter;
import patterns.structural.bridge.example2.printer.MoviePrinter;
import patterns.structural.bridge.example2.printer.Printer;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);

    }
}
