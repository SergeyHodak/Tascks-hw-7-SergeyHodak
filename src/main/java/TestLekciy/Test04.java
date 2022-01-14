package TestLekciy;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        //У каждого перечисления есть метод name(), который возвращает строковое представление перечисления:
        String yesName = TrueOrFalse04.yes.name();
        System.out.println(yesName); //yes

        //Зная строковое представление enum, мы можем получить объект enum. Для этого есть метод valueOf():
        TrueOrFalse04 value = TrueOrFalse04.valueOf("yes");
        System.out.println(value); //Will be TrueOrFalue.yes

        //По умолчанию метод toString() возвращает то же строковое представление, что и метод name().
        // Но метод toString() можно переопределить:
        System.out.println(Planet04.Earth);

        //Метод ordinal() возвращает порядковый номер объекта в перечислении, начиная с 0:
        System.out.println(Planet04.Earth.ordinal()); //0

        //Метод values() возвращает массив объектов перечисления, в порядке их объявления:
        for(Planet04 planet: Planet04.values()) {
            System.out.println(planet.name() +  " " + Arrays.toString(Planet04.values()));
        }

        //Используя ordinal(), можно получить нужный нам элемент:
        int earthIndex = Planet04.Earth.ordinal(); //узнали порядковый номер
        Planet04 earth = Planet04.values()[earthIndex]; //берем из массива элемент по индексу
        System.out.println(earth.name()); //Earth
    }

}
enum TrueOrFalse04 {
    yes,
    no
}

enum Planet04 {
    Earth,
    Mars;

    @Override
    public String toString() {
        switch(this) {
            case Earth: return "Земля";
            case Mars: return "Марс";
        }

        //Если для какой-то планеты мы не определили перевод, то возвращаем стандартную реализацию toString().
        // Для этого используем конструкцию super.toString().
        return super.toString();
    }
}
