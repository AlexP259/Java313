package homeWork_37;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Movie> moviesArchive;
    private String dbName;

    public Model() {
        this.dbName = "src\\homeWork_37\\db.txt";
        this.moviesArchive = loadData();
    }

    public void addMovie(Map<String, String> movieInfo) {
        Movie movie = new Movie(movieInfo);
        this.moviesArchive.put(movieInfo.get("название фильма"), movie);
    }

    public Collection<Movie> getAllMovies() {
        return this.moviesArchive.values();
    }

    public Map<String, String> getOneMovie(String titleOneMovie) {
        Movie movie = this.moviesArchive.get(titleOneMovie);
        Map<String, String> oneMovie = new LinkedHashMap<>();
        oneMovie.put("название фильма", movie.getMovieTitle());
        oneMovie.put("жанр", movie.getGenre());
        oneMovie.put("режиссер", movie.getDirector());
        oneMovie.put("год выпуска", movie.getYearOfIssue());
        oneMovie.put("длительность", movie.getDuration());
        oneMovie.put("студия", movie.getStudio());
        oneMovie.put("актеры", movie.getActors());
        return oneMovie;
    }

    public Movie removeMovie(String titleMovieForRemove) {
        return this.moviesArchive.remove(titleMovieForRemove);
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbName))) {
            oos.writeObject(this.moviesArchive);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.dbName))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex) {
            return new LinkedHashMap();
        }
    }
}










