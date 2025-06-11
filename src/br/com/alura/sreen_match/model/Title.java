package br.com.alura.sreen_match.model;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean includedInThePlan;
    private double sumOfRating;
    private int totalReviews;
    private int durationInMinutes;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public double getSumOfRating() {
        return sumOfRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void displaysTechnicalDataSheet() {
        System.out.println("Name of the film: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    public void rate(double grade){
        sumOfRating += grade;
        totalReviews++;
    }

    public double takeMedia(){
        return sumOfRating / totalReviews;
    }
}
