package lesson22.articles;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {    // Model - основной класс, он будет сохранять наши данные типа Map, то есть коллекция. Но нам нужен еще вспомогательный класс, где будет храниться одна статья. Мы через этот вспомогательный класс будет передавать статьи в коллекцию
    private Map<String, Article> articles;
    private String dbName;

    public Model() {
        this.dbName = "db.txt";     // будет храниться в нечитаемом формате
        this.articles = loadData();  // этот linkedHashMap хранит пары "название статьи/экземпляр класса Article (т.е. сама статья)"
    }

    public void addArticle(Map dictArticle) {
        Article article = new Article(dictArticle); // из Map мы делаем инстанс Article, в который переносим всё - название, автора, количество страниц и описание статьи. Все эти значения теперь хранятся в соотв-их полях инстанса Article
        articles.put(dictArticle.get("название").toString(), article);  // также из этого map мы извлекаем название статьи и это название делаем ключом, значением делаем созданный инстанс Article.
    }

    public Collection getAllArticles() {
        return articles.values();   // вернем только значения ключей. Метод values вернет именно Collection
    }

    public Map getSingleArticle(String userTitle) throws NullPointerException {
        Article article = this.articles.get(userTitle);
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", article.getTitle());
        dictArticle.put("автор", article.getAuthor());
        dictArticle.put("количество страниц", article.getPage());
        dictArticle.put("описание", article.getDescription());
        return dictArticle;
    }

    public Article removeArticle(String userTitle) {
        return this.articles.remove(userTitle);     // remove возвращает то, что удаляет
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbName))) {
            oos.writeObject(this.articles);
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


class Article implements Serializable {
    private String title;
    private String author;
    private String page;
    private String description;

    public Article(Map dictArticle) {
        this.title = dictArticle.get("название").toString();        // !!!!! не так как на уроке
        this.author = dictArticle.get("автор").toString();
        this.page = dictArticle.get("количество страниц").toString();
        this.description = dictArticle.get("описание").toString();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.author + ")";   // в таком виде будет выводиться статья, мы будем использовать этот способ вывода когда хотим показать кратко все статьи
    }
}