package solid.ocp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        Rectangle [] rectangles = {
                new Rectangle(5, 10),
                new Rectangle(10, 20),
                new Rectangle(12, 60),
                new Rectangle(5, 2),
                new Rectangle(17, 33)
        };

        AreaCalculator ac = new AreaCalculator();
        System.out.println(ac.areaCalc(rectangles));

        Object[] shapes = {
                new Rectangle(5, 10),
                new Rectangle(10, 20),
                new Circle(8),
                new Circle(15),
                new Circle(29)
        };
        System.out.println(ac.areaCalc(shapes));
    }
}
