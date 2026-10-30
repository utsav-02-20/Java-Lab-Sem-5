interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {

    public void print() {
        System.out.println("Printing Document...");
    }

    public void show() {
        System.out.println("Displaying Document...");
    }
}

public class multiple {
    public static void main(String[] args) {

        Document d = new Document();

        d.print();
        d.show();
    }
}