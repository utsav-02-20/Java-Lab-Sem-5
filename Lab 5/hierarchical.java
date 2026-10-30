class Shape {
    void display() {
        System.out.println("Calculating Area:");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        display();
        System.out.println("Circle Area: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10, breadth = 5;

    void area() {
        display();
        System.out.println("Rectangle Area: " +
                (length * breadth));
    }
}

class Triangle extends Shape {
    double base = 8, height = 6;

    void area() {
        display();
        System.out.println("Triangle Area: " +
                (0.5 * base * height));
    }
}

public class hierarchical {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.area();
        r.area();
        t.area();
    }
}