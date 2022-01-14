package TestLekciy;

public class PrimrAnnGoi {
    public void shapeName() {
        System.out.println("Shape");
    }
}

class Square extends PrimrAnnGoi {
    @Override
    public void shapeName() {
        System.out.println("Square");
    }
}

class Triangle extends PrimrAnnGoi {
    @Override
    public void shapeName(){
        System.out.println("Triangle");
    }
}

class Rectangle extends PrimrAnnGoi {
    @Override
    public void shapeName(){
        System.out.println("Rectangle");
    }
}

class Rhombus extends PrimrAnnGoi {
    @Override
    public void shapeName(){
        System.out.println("Rhombus");
    }
}

class Circle extends PrimrAnnGoi {
    @Override
    public void shapeName() {
        System.out.println("Circle");
    }
}

class Choice {
    public void choiceShape(PrimrAnnGoi shape) {
        shape.shapeName();
    }
}

// дальше мой класс для реализации связывания всего написанного ей кода выше.
class Test {
    public static void main(String[] args) {
        PrimrAnnGoi square = new Square();
        PrimrAnnGoi triangle = new Triangle();
        PrimrAnnGoi rectangle = new Rectangle();
        PrimrAnnGoi rhombus = new Rhombus();
        PrimrAnnGoi circle = new Circle();

        square.shapeName();
        triangle.shapeName();
        rectangle.shapeName();
        rhombus.shapeName();
        circle.shapeName();

        //типа пользовательские настройки кфигурам
        Choice a = new Choice(); // хотя классом Choice она пыталась это сделать. попробую к нему достучатся
        a.choiceShape(new Square()); // получилось вот так

        //базовые?
        PrimrAnnGoi b = new PrimrAnnGoi();
        b.shapeName();
    }
}