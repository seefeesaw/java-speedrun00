package datatypes;



public class Direction {
    public enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        Directions direction1 = Directions.NORTH;
        Directions direction2 = Directions.WEST;

        System.out.println("First direction: " + direction1);
        System.out.println("Second direction: " + direction2);
    }
}
