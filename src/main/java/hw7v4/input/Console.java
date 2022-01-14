package hw7v4.input;

import java.util.Scanner;

public class Console {
    public String shape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиде что-то из существующего: Line, Triangle, Polyhedron, Quad, Circle");
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }

    public static void main(String[] args) {
        Console a = new Console();
        System.out.println(a.shape());
    }
}