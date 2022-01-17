package hw7v4.input;

import hw7v4.Shape.*;

enum Shapes {
    Line, Triangle, Polyhedron, Quad, Circle;
}

public class SelectFromList {
    public static Shape name(String name) {
        switch(name) {
            case "Line": return new Line();
            case "Triangle": return new Triangle();
            case "Polyhedron": return new Polyhedron();
            case "Quad": return new Quad();
            case "Circle": return new Circle();
        }
        return new Shape();
    }

    public static void main(String[] args) {
        SelectFromList text = new SelectFromList();
        System.out.println(text.name("Line"));
    }
}
