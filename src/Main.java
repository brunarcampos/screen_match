
public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Godfather";
        myFilm.yearOfRelease = 1972;
        myFilm.durationInMinutes = 175;

        System.out.println(myFilm.name);
        System.out.println(myFilm.yearOfRelease);

    }
}