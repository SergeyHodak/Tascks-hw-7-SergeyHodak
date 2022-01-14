package hw7v4.Shape;

public class ExistingFigure{
    public String name(String name) {
        switch(name) {
            case "Line": return new Line().getName();
            case "Triangle": return new Triangle().getName();
            case "Polyhedron": return new Polyhedron().getName();
            case "Quad": return new Quad().getName();
            case "Circle": return new Circle().getName();
        }
        return new Shape().getName();
    }
    public static void main(String[] args) {
        ExistingFigure text = new ExistingFigure();
        System.out.println(text.name("Line"));
    }
}
