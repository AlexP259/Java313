package lesson22.articles;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model articleModel;
    private View userInterface;

    public Controller() {
        this.articleModel = new Model();    // одно из полей контроллера это экземпляр Model
        this.userInterface = new View();    // второе поле - экземпляр View
    }

    public void run() {     // Начинается работа программы, т.е. цикл
        String answer = "";
        while (!answer.equals("q")) {   // пока ответ пользователя не будет равен "q", цикл продолжается
            answer = userInterface.waitUserAnswer(); // через вызов метода userInterface (наш View), где звучит вопрос, получаем ответ
            checkUserAnswer(answer);  // теперь этот ответ отправляем дальше в метод самого контроллера и, в зависимости от того что это за ответ, будут производиться некие действия
        }
    }

    public void checkUserAnswer(String answer) {
        if (answer.equals("1")) {
            Map articles = this.userInterface.addUserArticles();    // если ответ 1, запрашиваем у пользователя данные для создания одного нового экземпляра статьи (название, автор, кол-во страниц и т.д.)
            this.articleModel.addArticle(articles); // добавляем этот экземпляр статьи в articleModel (наш Model)
        } else if (answer.equals("2")) {
            Collection articles = this.articleModel.getAllArticles();
            this.userInterface.showAllArticles(articles);
        } else if (answer.equals("3")) {
            String articleTitle = this.userInterface.getUserArticle();
            try {
                Map article = this.articleModel.getSingleArticle(articleTitle);
                this.userInterface.showSingleArticle(article);
            } catch (NullPointerException npe) {
                this.userInterface.showIncorrectTitleError(articleTitle);
            }
        } else if (answer.equals("4")) {
            String articleTitle = this.userInterface.getUserArticle();
            Article title = this.articleModel.removeArticle(articleTitle);
            this.userInterface.removeSingleArticle(title);
        } else if (answer.equals("q")) {
            this.articleModel.saveData();
        } else {
            this.userInterface.showIncorrectAnswerError(answer);
        }


    }
}
