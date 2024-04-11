package homeWork_37;

import java.io.Serializable;
import java.util.Map;

public class Movie implements Serializable {
    private String movieTitle;
    private String genre;
    private String director;
    private String yearOfIssue;
    private String duration;
    private String studio;
    private String actors;

    public Movie(Map<String, String> movieInfo) {
        this.movieTitle = movieInfo.get("название фильма");
        this.genre = movieInfo.get("жанр");
        this.director = movieInfo.get("режиссер");
        this.yearOfIssue = movieInfo.get("год выпуска");
        this.duration = movieInfo.get("длительность");
        this.studio = movieInfo.get("студия");
        this.actors = movieInfo.get("актеры");
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getDuration() {
        return duration;
    }

    public String getStudio() {
        return studio;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return this.movieTitle + " (" +  this.genre + ", " + this.yearOfIssue + ")";
    }
}
















