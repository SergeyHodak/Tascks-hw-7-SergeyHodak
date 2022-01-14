package hw7v4.input;

enum Shapes {
    Line, Triangle, Polyhedron, Quad, Circle;
}

public class SelectFromList {
    public String name(String name) {
        switch(name) {
            case "Line": return Shapes.Line.name();
            case "Triangle": return Shapes.Triangle.name();
            case "Polyhedron": return Shapes.Polyhedron.name();
            case "Quad": return Shapes.Quad.name();
            case "Circle": return Shapes.Circle.name();
        }
        return "Такой фигуры нет";
    }

    public static void main(String[] args) {
        SelectFromList text = new SelectFromList();
        System.out.println(text.name("Line"));
    }
}
