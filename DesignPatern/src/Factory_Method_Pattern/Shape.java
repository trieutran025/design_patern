package Factory_Method_Pattern;

public interface Shape {
	void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Draw Circle");
    }
}
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }
}