package hw7v4;

import hw7v4.Shape.ExistingFigure;
import hw7v4.input.Console;
import hw7v4.input.SelectFromList;
import hw7v4.input.StringR;
import hw7v4.output.Consolea;
import hw7v4.output.WritingToFile;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //1 откуда берем инфу. над которой фигурой будем работать (консоль, строка, выбор из списка)
        //2 характеристики выбранной фигуры, (базовые, пользовательские)
        //3 куда отдать результат, (консоль, файл, вернуть в место вызова)

        System.out.println("-------------------------------------------");
        String infa1 = new Console().shape(); // вводим в консоль имя фигуры
        String figure1 = new ExistingFigure().name(infa1); //выбираем из списка фигур эту фигуру
        new Consolea().output(figure1); //выводим в консоль результат
        System.out.println("-------------------------------------------");

        String infa2 = new StringR().stringR("Line"); // передаем сюда строку, указвывая одно из уже прописанных классов Line, Triangle, Polyhedron, Quad, Circle
        String figure2 = new ExistingFigure().name(infa2); //выбираем из списка фигур эту фигуру
        new Consolea().output(figure2); //выводим в консоль результат
        System.out.println("-------------------------------------------");

        String infa3 = new SelectFromList().name("dddd");//выбираем готовую вигуру спользуя одно из имен классов Line, Triangle, Polyhedron, Quad, Circle
        String figure3 = new ExistingFigure().name(infa3); //выбираем из списка фигур эту фигуру
        new WritingToFile().file(figure3); //выводим в файл результат
        System.out.println("-------------------------------------------");
    }
}