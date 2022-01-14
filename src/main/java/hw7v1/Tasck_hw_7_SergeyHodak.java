package hw7v1;

public class Tasck_hw_7_SergeyHodak {
    public static void main(String[] args) {
        Shape a = new Shape();
        System.out.println(a.polyhedron("белый", 0.25, "черный", "прозрачный"));
        System.out.println(a.Quad("зелёный", 1, "рыжий", "кирпич"));
        System.out.println(a.Triangle("черный", 1.25, "красный", "камень"));
        System.out.println(a.Circle("желтый", 0.5, "белый", "алюминий"));
        System.out.println(a.Line("розовый", 0.75, "прозрачный", "лак"));

        BasicVisualization b = new BasicVisualization();
        System.out.println(b.polyhedron("белый", 0.25, "черный", "прозрачный"));
        System.out.println(b.Quad("зелёный", 1, "рыжий", "кирпич"));
        System.out.println(b.Triangle("черный", 1.25, "красный", "камень"));
        System.out.println(b.Circle("желтый", 0.5, "белый", "алюминий"));
        System.out.println(b.Line("розовый", 0.75, "прозрачный", "лак"));
    }
}

interface Visualization { // интерфейс поведения визуализации
    String color(String color); // цвет фигуры
}

interface Circuit extends Visualization { // интерфейс поведения для контура фигуры
    String thickness(double cifra); // толщина контура
    String colorCircuit(String color); // цвет контура
}

interface Frame extends Visualization { // интерфейс поведения для внутреннго тела фигуры
    String texture(String material); // текстура тела
}

class Shape implements Circuit, Frame { // базовый класс
    @Override
    public String color(String color) { // цвет фигуры
        return "Цвет фигуры: " + color;
    }

    @Override
    public String thickness(double cifra) { // толщина контура
        return "Толщина контура: " + cifra;
    }

    @Override
    public String colorCircuit(String color) { // цвет контура
        return "Цвет контура: " + color;
    }

    @Override
    public String texture(String material) { // текстура тела
        return "Текстура: " + material;
    }

    public String polyhedron(String color, double thickness, String colorCircuit, String texture) {
        return "Фигура: многоугольник. " + color(color) + ". " +
                thickness(thickness) + ". " + colorCircuit(colorCircuit) +
                ". " + texture(texture) + ".";
    }

    public String Quad(String color, double thickness, String colorCircuit, String texture) {
        return "Фигура: четырехугольник. " + color(color) + ". " +
                thickness(thickness) + ". " + colorCircuit(colorCircuit) +
                ". " + texture(texture) + ".";
    }

    public String Triangle(String color, double thickness, String colorCircuit, String texture) {
        return "Фигура: треугольник. " + color(color) + ". " +
                thickness(thickness) + ". " + colorCircuit(colorCircuit) +
                ". " + texture(texture) + ".";
    }


    public String Circle(String color, double thickness, String colorCircuit, String texture) {
        return "Фигура: круг. " + color(color) + ". " +
                thickness(thickness) + ". " + colorCircuit(colorCircuit) +
                ". " + texture(texture) + ".";
    }

    public String Line(String color, double thickness, String colorCircuit, String texture) {
        return "Фигура: линия. " + color(color) + ". " +
                thickness(thickness) + ". " + colorCircuit(colorCircuit) +
                ". " + texture(texture) + ".";
    }
}

class BasicVisualization extends Shape {
    @Override
    public String polyhedron(String color, double thickness, String colorCircuit, String texture) {
        System.out.println(super.polyhedron(color, thickness, colorCircuit, texture));
        return  "****\n **\n****";
    }

    @Override
    public String Quad(String color, double thickness, String colorCircuit, String texture) {
        System.out.println(super.Quad(color, thickness, colorCircuit, texture));
        return "**\n**";
    }

    @Override
    public String Triangle(String color, double thickness, String colorCircuit, String texture) {
        System.out.println(super.Triangle(color, thickness, colorCircuit, texture));
        return " *\n* *";
    }

    @Override
    public String Circle(String color, double thickness, String colorCircuit, String texture) {
        System.out.println(super.Circle(color, thickness, colorCircuit, texture));
        return  "     **\n *        *\n*          *\n *        *\n     **";
    }

    @Override
    public String Line(String color, double thickness, String colorCircuit, String texture) {
        System.out.println(super.Line(color, thickness, colorCircuit, texture));
        return "***********";
    }
}