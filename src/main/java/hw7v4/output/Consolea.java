package hw7v4.output;

import hw7v4.Shape.Line;
import hw7v4.Shape.Shape;

public class Consolea {
    public void output(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Consolea test = new Consolea();
        //test.output(Shape.Line().getName());
    }
}