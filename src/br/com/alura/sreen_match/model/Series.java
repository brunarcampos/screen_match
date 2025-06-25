package br.com.alura.sreen_match.model;

public class Series extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Series(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie:" + this.getName() + "(" + this.getYearOfRelease() + ")";
    }
}
