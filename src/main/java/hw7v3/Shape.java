package hw7v3;

enum Shapes {
    Line, Triangle, Polyhedron, Quad, Circle;
}

class Shape {
    public static String getName(Shapes name) {
        switch(name) {
            case Line: return new Line().print();
            case Triangle: return "Треугольник";
            case Polyhedron: return "Многоугольник";
            case Quad: return "Четырехугольник";
            case Circle: return "Круг";
        }
        return "Такой фигуры нет";
    }
}

class Line extends Shape {
    public String print() {
        return "Линия";
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Shape.getName(Shapes.Line));
        System.out.println(Shape.getName(Shapes.Triangle));
        System.out.println(Shape.getName(Shapes.Polyhedron));
        System.out.println(Shape.getName(Shapes.Quad));
        System.out.println(Shape.getName(Shapes.Circle));
    }
}