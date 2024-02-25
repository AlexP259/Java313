package practics.practics_17.exercise_1;

public class Main {
    public static void main(String[] args) {
        Teapot teapot1 = new Teapot("Чайник Philips", "Электрический, на 2 литра");
        teapot1.printSound();
        teapot1.show();
        teapot1.desc();

        Microwave microwave1 = new Microwave("Микроволновка Samsung", "Разогревает еду за минуту, " +
                "но тарелку всегда на 40 градусов сильнее");
        microwave1.printSound();
        microwave1.show();
        microwave1.desc();

        Car car1 = new Car("Автом...ахахаха...иль Лада Приора", "на 4 Ашота");
        car1.printSound();
        car1.show();
        car1.desc();

        Steamship steamboat1 = new Steamship("Пароход \"Неотопляемый\"", "Угольный, на 2000 литров воды в час");
        steamboat1.printSound();
        steamboat1.show();
        steamboat1.desc();
    }
}
