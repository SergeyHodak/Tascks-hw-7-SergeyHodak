package hw7v4.input;

import hw7v4.Shape.Shape;

public class StringR {
    public Shape stringR(String result) {
        for (int i = 0; i < Shapes.values().length; i++) {
            if (result.equals(Shapes.values()[i].name())) {
                return SelectFromList.name(Shapes.values()[i].name());
            }
        }
        return new Shape();
    }

    public static void main(String[] args) {
        StringR text = new StringR();
        System.out.println(text.stringR("Line"));
    }
}
