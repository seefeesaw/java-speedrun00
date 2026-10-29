package datatypes;



public class Shape {
    public enum Geomatric_Shape {
        SQUARE,
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON
    }

    public static void main(String[] args) {
        Geomatric_Shape shape1 = Geomatric_Shape.CIRCLE;
        Geomatric_Shape shape2 = Geomatric_Shape.SQUARE;

        System.out.println("First shape: " + shape1);
        System.out.println("Second shape: " + shape2);
    }
}
