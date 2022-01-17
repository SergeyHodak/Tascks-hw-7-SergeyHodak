package hw7v4.input;

import hw7v4.Shape.Shape;
import hw7v4.input.SelectFromList;

import java.util.Scanner;

public class Console {
    public Shape shape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиде что-то из существующего: Line, Triangle, Polyhedron, Quad, Circle");
        String result = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < Shapes.values().length; i++) {
            if (result.equals(Shapes.values()[i].name())) {
                return SelectFromList.name(Shapes.values()[i].name());
            }
        }
        return new Shape();
    }

    public static void main(String[] args) {
        Console a = new Console();
        System.out.println(a.shape());
    }
}