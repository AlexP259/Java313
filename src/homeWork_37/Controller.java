package homeWork_37;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model moviesArchiveModel;
    private View userInterface;

    public Controller() {
        this.moviesArchiveModel = new Model();
        this.userInterface = new View();
    }

    public void run() {
        String answer = "";
        while (!answer.equals("q")) {
            answer = this.userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }

    public void checkUserAnswer(String answer) {
        switch (answer) {
            case "1" -> {
                Map<String, String> movieInfo = this.userInterface.addUserMovie();
                this.moviesArchiveModel.addMovie(movieInfo);
            }
            case "2" -> {
                Collection<Movie> allMovies = this.moviesArchiveModel.getAllMovies();
                this.userInterface.showAllMovies(allMovies);
            }
            case "3" -> {
                String titleOneMovie = this.userInterface.userOneMovieChoise();
                try {
                    Map<String, String> oneMovie = this.moviesArchiveModel.getOneMovie(titleOneMovie);
                    this.userInterface.showOneMovie(oneMovie);
                } catch (NullPointerException ex) {
                    this.userInterface.showIncorrectTitleError(titleOneMovie);
                }
            }
            case "4" -> {
                String titleMovieForRemove = this.userInterface.userOneMovieChoise();
                try {
                    Movie movieForRemove = this.moviesArchiveModel.removeMovie(titleMovieForRemove);
                    if (movieForRemove == null) {
                        throw new NullPointerException();
                    }
                    this.userInterface.removeMovieInfo(movieForRemove);
                } catch (NullPointerException ex) {
                    this.userInterface.showIncorrectTitleError(titleMovieForRemove);
                }
            }
            case "q" -> {
                this.moviesArchiveModel.saveData();
            }
            default -> {
                this.userInterface.incorrectAnswerError(answer);
            }
        }
    }
}
















