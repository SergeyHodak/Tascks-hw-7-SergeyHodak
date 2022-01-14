package hw7v4.Shape;

public class Shape {
    String getName() {
        return "Такой фигуры нет в списках. Применены - базовые характеристики, класса Shape";
    }

    public static void main(String[] args) {
        Shape text = new Shape();
        System.out.println(text.getName());
    }
}