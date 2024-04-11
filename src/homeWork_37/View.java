package homeWork_37;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer() {
        System.out.println("================ Редактирование данных каталога фильмов ================");
        System.out.println("Действия с фильмами:");
        System.out.println("1 - добавление фильма");
        System.out.println("2 - каталог фильмов");
        System.out.println("3 - просмотр определенного фильма");
        System.out.println("4 - удаление фильма");
        System.out.println("q - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("========================================================================");
        return userAnswer;
    }

    public Map<String, String> addUserMovie() {
        Map<String, String> movie = new LinkedHashMap<>();
        movie.put("название фильма", null);
        movie.put("жанр", null);
        movie.put("режиссер", null);
        movie.put("год выпуска", null);
        movie.put("длительность", null);
        movie.put("студия", null);
        movie.put("актеры", null);
        System.out.println("================ Добавление фильма ================");
        movie.forEach((key, value) -> {
            System.out.print("Введите " + key + ": ");
            movie.put(key, input.nextLine());
        });
        System.out.println("====================================================");
        return movie;
    }

    public void showAllMovies(Collection allMovies) {
        System.out.println("================ Каталог фильмов ================");
        allMovies.forEach(System.out::println);
        System.out.println("=================================================");
    }

    public String userOneMovieChoise() {
        System.out.println("================ Выберите фильм ================");
        System.out.print("-> ");
        String titleOneMovie = input.nextLine();
        System.out.println("================================================");
        return titleOneMovie;
    }

    public void showOneMovie(Map<String, String> oneMovie) {
        System.out.println("================ Выбранный фильм ================");
        oneMovie.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("=================================================");
    }

    public void showIncorrectTitleError(String titleOneMovie) {
        System.out.println("================ Сообщение об ошибке ================");
        System.out.println("Фильма с названием " + titleOneMovie + " не существует");
        System.out.println("=====================================================");
    }

    public void removeMovieInfo(Movie movieForRemove) {
        System.out.println("================ Удаление фильма ================");
        System.out.println("Фильм " + movieForRemove + " был удален");
        System.out.println("=================================================");
    }

    public void incorrectAnswerError(String answer) {
        System.out.println("================ Сообщение об ошибке ================");
        System.out.println("Варианта " + answer + " не существует");
        System.out.println("=====================================================");
    }
}










