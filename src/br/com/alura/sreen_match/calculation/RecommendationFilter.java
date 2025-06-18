package br.com.alura.sreen_match.calculation;

public class RecommendationFilter {
    public void filter(Classifiable classifiable){
        if (classifiable.getrating() >= 4){
            System.out.println("Is among the favorites of the moment");
        } else if (classifiable.getrating() >= 2){
            System.out.println("Very well rated at the moment!");
        } else {
            System.out.println("Add it to your list to watch later");
        }
    }
}
