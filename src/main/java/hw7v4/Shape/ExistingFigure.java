package hw7v4.Shape;

public class ExistingFigure extends Shape{
    public String name(Shape name) {
        return name.getName();
    }
    public static void main(String[] args) {
        ExistingFigure text = new ExistingFigure();
        System.out.println(text.name(new Line()));
    }
}
