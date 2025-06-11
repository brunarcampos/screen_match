import br.com.alura.sreen_match.calculation.TimeCalculator;
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
        lost.setMinutesPerEpisode(60);
        System.out.println("Duration to binge watch Lost: " + lost.getDurationInMinutes());

        Film anotherMovie = new Film();
        anotherMovie.setName("Avatar");
        anotherMovie.setYearOfRelease(2022);
        anotherMovie.setDurationInMinutes(200);
        System.out.println("Film duration: " + anotherMovie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myFilm);
        calculator.includes(anotherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

    }
}