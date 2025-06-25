package br.com.alura.sreen_match.principal;

import br.com.alura.sreen_match.calculation.RecommendationFilter;
import br.com.alura.sreen_match.calculation.TimeCalculator;
import br.com.alura.sreen_match.model.Episode;
import br.com.alura.sreen_match.model.Film;
import br.com.alura.sreen_match.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("The Godfather", 1972);
        myFilm.setDurationInMinutes(175);
        System.out.println("Film duration: " + myFilm.getDurationInMinutes());

        myFilm.displaysTechnicalDataSheet();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.takeMedia());

        Series lost = new Series("Lost", 2004);
        lost.displaysTechnicalDataSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(25);
        lost.setMinutesPerEpisode(60);
        System.out.println("Duration to binge watch Lost: " + lost.getDurationInMinutes());

        Film anotherMovie = new Film("Avatar", 2022);
        anotherMovie.setDurationInMinutes(200);
        System.out.println("Film duration: " + anotherMovie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myFilm);
        calculator.includes(anotherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myFilm);
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        var paulosMovie = new Film("Dogville", 2003);
        paulosMovie.setDurationInMinutes(200);
        paulosMovie.rate(10);

        ArrayList<Film> listOfFilms = new ArrayList<>();
        listOfFilms.add(paulosMovie);
        listOfFilms.add(myFilm);
        listOfFilms.add(anotherMovie);
        System.out.println("List size: " + listOfFilms.size());
        System.out.println("First film: " + listOfFilms.get(0).getName());
        System.out.println(listOfFilms);
        System.out.println("tostring of the film " + listOfFilms.get(0).toString());



    }
}