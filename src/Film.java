public class Film {
    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double sumOfRating;
    int totalReviews;
    int durationInMinutes;

    void displaysTechnicalDataSheet() {
        System.out.println("Name of the film: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    void rate(double grade){
        sumOfRating += grade;
        totalReviews++;
    }

    double takeMedia(){
        return sumOfRating / totalReviews;
    }
}
