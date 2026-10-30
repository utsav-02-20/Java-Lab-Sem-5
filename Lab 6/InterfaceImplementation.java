interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    double radius = 5;

    public void calculateArea() {
        System.out.println("Circle Area: " +
                (3.14 * radius * radius));
    }

    public void calculatePerimeter() {
        System.out.println("Circle Perimeter: " +
                (2 * 3.14 * radius));
    }
}

class Rectangle implements Shape {
    double length = 10, breadth = 5;

    public void calculateArea() {
        System.out.println("Rectangle Area: " +
                (length * breadth));
    }

    public void calculatePerimeter() {
        System.out.println("Rectangle Perimeter: " +
                (2 * (length + breadth)));
    }
}

class Triangle implements Shape {
    double a = 3, b = 4, c = 5;

    public void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Triangle Area: " + area);
    }

    public void calculatePerimeter() {
        System.out.println("Triangle Perimeter: " +
                (a + b + c));
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        c.calculateArea();
        c.calculatePerimeter();

        r.calculateArea();
        r.calculatePerimeter();

        t.calculateArea();
        t.calculatePerimeter();
    }
}