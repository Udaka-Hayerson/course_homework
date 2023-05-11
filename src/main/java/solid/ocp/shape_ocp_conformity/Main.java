package solid.ocp.shape_ocp_conformity;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(8),
                new Circle(15),
                new Circle(29),
                new Rectangle(5, 10),
                new Rectangle(10, 20),
                new Rectangle(388, 2699),
                new Triangle(1200, 1300, 2499),
                new Triangle(30, 40, 50),
                new Triangle(300, 400, 500)
        };

        Shape[] shapes_t = {
                new Triangle(3, 4, 5),
                new Triangle(30, 40, 50),
                new Triangle(300, 400, 500),
                new Triangle(3000, 4000, 5000),
                new Triangle(30000, 40000, 50000),
                new Triangle(300000, 400000, 500000),
                new Triangle(3000000, 4000000, 5000000),
                new Triangle(30000000, 40000000, 50000000),
                new Triangle(300000000, 400000000, 500000000),
                new Triangle(3000000000L, 4000000000L, 5000000000L),
                new Triangle(30000000000L, 40000000000L, 50000000000L),
                new Triangle(300000000000L, 400000000000L, 500000000000L),
                new Triangle(3000000000000L, 4000000000000L, 5000000000000L),
                new Triangle(30000000000000L, 40000000000000L, 50000000000000L),
                new Triangle(300000000000000L, 400000000000000L, 500000000000000L),
                new Triangle(3000000000000000L, 4000000000000000L, 5000000000000000L),
                new Triangle(30000000000000000L, 40000000000000000L, 50000000000000000L),
                new Triangle(300000000000000000L, 400000000000000000L, 500000000000000000L)
        };

        System.out.println(AreaCalculator.sumArea(shapes));
        System.out.println(AreaCalculator.sumArea(shapes_t));

    }
}
class ParserRealization {
    public void parse(String[] data) {
        if (data[0].equals("male")) {
            // код
        } else {
            if (data[0].equals("female")) {
                // код
            }
        }
    }
}