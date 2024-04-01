package lesson20.notebook_stream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Notebook> noteStream = Stream.of(    // потоком выступают инстансы
                new Notebook("ThinkPad", 40000),
                new Notebook("MacBook", 45000),
                new Notebook("Legion", 55000)
        );

        noteStream.flatMap(p -> Stream.of(
                "название: " + p.getName() + ", цена без скидки: " + p.getPrice(),
                "название: " + p.getName() + ", цена со скидкой: " + (p.getPrice() - (int) (p.getPrice() * 0.1))
        )).forEach(s -> System.out.println(s));


//        noteStream.map(p -> "название: " + p.getName() + ", цена: " + p.getPrice()).forEach(s -> System.out.println(s));
//        noteStream.map(p -> p.getName()).forEach(s -> System.out.println(s));
//        noteStream.forEach(s -> System.out.println(s));
//        noteStream.filter(p -> p.getPrice() < 50000).forEach(p -> System.out.println(p.getName()));
    }
}


class Notebook{
    private String name;
    private int price;

    public Notebook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}