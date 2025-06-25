package br.com.alura.sreen_match.model;

import br.com.alura.sreen_match.calculation.Classifiable;

public class Film extends Title implements Classifiable {
    private  String manager;

    public  Film(String name, int yearOfRelease){
        super(name, yearOfRelease);
    }

    public String getManager() {

        return manager;
    }

    public void setManager(String manager) {

        this.manager = manager;
    }

    @Override
    public int getrating() {
        return (int )takeMedia() / 2;
    }

    @Override
    public String toString() {
        return "Film: " + this.getName() + "(" + this.getYearOfRelease() + ")";
    }
}
