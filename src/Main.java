
public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Godfather";
        myFilm.yearOfRelease = 1972;
        myFilm.durationInMinutes = 175;

        myFilm.displaysTechnicalDataSheet();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);
        System.out.println(myFilm.sumOfRating);
        System.out.println(myFilm.totalReviews);
        System.out.println(myFilm.takeMedia());
    }
}