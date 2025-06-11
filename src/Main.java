import br.com.alura.sreen_match.model.Film;
import br.com.alura.sreen_match.model.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("The Godfather");
        myFilm.setYearOfRelease(1972);
        myFilm.setDurationInMinutes(175);
        System.out.println("Film duration: " + myFilm.getDurationInMinutes());

        myFilm.displaysTechnicalDataSheet();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.takeMedia());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setYearOfRelease(2004);
        lost.displaysTechnicalDataSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(25);
        System.out.println("Film duration: " + lost.getDurationInMinutes());


    }
}