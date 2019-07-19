package patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Prototype Pattern");

        System.out.println(movie);
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Prototype Pattern Part II");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());

    }
}
