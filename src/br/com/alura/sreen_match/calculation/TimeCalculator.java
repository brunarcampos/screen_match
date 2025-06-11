package br.com.alura.sreen_match.calculation;

import br.com.alura.sreen_match.model.Film;
import br.com.alura.sreen_match.model.Series;
import br.com.alura.sreen_match.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    //public void includes(Film f) {
    //    this.totalTime += f.getDurationInMinutes();
    // }
    // public void includes(Series s) {
    //     this.totalTime += s.getDurationInMinutes();
    //  }

    public void includes(Title t){
        this.totalTime += t.getDurationInMinutes();
    }
}
