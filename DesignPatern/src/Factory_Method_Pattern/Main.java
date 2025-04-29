package Factory_Method_Pattern;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("circle");
        shape.draw();
    }
}
