package practics.my_practics_3_Stream_API;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        // stream() - мы создали поток. Далее надо применять методы.  Методы потоков делятся на 2 категории:
        // "конвейерные" и "терминальные"
        // 1) Конвейерные методы позволяют производить какие-то действия с потоком, например, применять какие-то методы к
        // КАЖДОМУ элементу этого потока, что-то изменять в данных или фильтровать данные. После применения
        // конвейерного метода, данные останутся в состоянии потока! Что бы вернуть их в нормальное состояние нужны
        // терминальные методы
        // 2) Терминальные - возвращают данные из состояния потока

//        Stream<Person> personStream = persons.stream()      // Сохранили в переменную с типом данных Stream
//                .filter(p -> p.getAge() > 35);
//        System.out.println(personStream.collect(Collectors.toList()));   // Вывели, преобразовав поток в List. Без toList получим имя класса и хеш объекта - java.util.stream.ReferencePipeline$2@723279cf


//        Optional<Person> person = persons.stream()
//                .filter(p -> p.getAge() > 30)
//                .findFirst();
//        System.out.println(person.get());


        long persons2 = persons.stream()
                .filter(p -> p.getAge() > 35)
                .count();

        System.out.println(persons2);


//        List<Person> persons2 = persons.stream()
//                // Метод map в Java Stream API применяет заданную функцию к каждому элементу потока и возвращает новый поток, содержащий результаты преобразования.
//                // forEach применяет заданное действие к каждому элементу потока, но не возвращает новый поток. Он просто выполняет действие для каждого элемента,
//                // но не создает новую коллекцию или поток объектов.
//                .map(person -> new Person(person.getFirstName(), person.getLastName(), person.getAge() + 100))
//                .collect(Collectors.toList());

//                .filter(p -> p.getAge() > 35)    // Хотим пройтись по всем элементам списка persons и отфильтровать их по возрасту. Результат же сохраним в List
//                .sorted()      // чтоб сортировка отработала, надо чтоб класс реализовывал интерфейс Comparable<Person> и переопределял compareTo
//                .collect(Collectors.toList());

//        for (Person person : persons2) {
//            System.out.println(person);
//        }
    }
}
