package hw7v2;

public abstract class Shape {
    public abstract String getName();
    {System.out.println("_______________");}
}

class Line extends Shape {
    @Override
    public String getName() {
        return "Линия";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Треугольник";
    }
}

class Polyhedron extends Shape {
    @Override
    public String getName() {
        return "Многоугольник";
    }
}

class Quad extends Shape {
    @Override
    public String getName() {
        return "Четырехугольник";
    }
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Круг";
    }
}

enum Shapes {
    Line, Triangle, Polyhedron, Quad, Circle;

    @Override
    public String toString() {
        switch(this) {
            case Line: return new Line().getName();
            case Triangle: return new Triangle().getName();
            case Polyhedron: return new Polyhedron().getName();
            case Quad: return new Quad().getName();
            case Circle: return new Circle().getName();
        }
        return super.toString();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Shapes.Line);
        System.out.println(Shapes.Triangle);
        System.out.println(Shapes.Polyhedron);
        System.out.println(Shapes.Quad);
        System.out.println(Shapes.Circle);
    }
}