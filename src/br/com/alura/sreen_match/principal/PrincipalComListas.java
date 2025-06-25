package br.com.alura.sreen_match.principal;

import br.com.alura.sreen_match.model.Film;
import br.com.alura.sreen_match.model.Series;
import br.com.alura.sreen_match.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args){
        Film myFilm = new Film("The Godfather", 1972);
        myFilm.rate(9);
        Film anotherMovie = new Film("Avatar", 2022);
        anotherMovie.rate(6);
        var paulosMovie = new Film("Dogville", 2003);
        paulosMovie.rate(10);
        Series lost = new Series("Lost", 2004);

        List<Title> list = new ArrayList<>();
        list.add(paulosMovie);
        list.add(myFilm);
        list.add(anotherMovie);
        list.add(lost);
        for (Title item: list ) {
            System.out.println(item.getName());
            if(item instanceof Film film && film.getrating() > 2){
                System.out.println("Rating: " + film.getrating());
            }

        }
        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Jason Statham");
        buscarPorArtista.add("Tom Cruise");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("Ordenando por ano:");
        System.out.println(list);
    }
}
