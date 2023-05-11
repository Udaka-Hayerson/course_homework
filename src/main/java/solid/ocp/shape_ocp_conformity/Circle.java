package solid.ocp.shape_ocp_conformity;

public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = area();
    }


    @Override
    public double area() {
        return  Math.pow(this.getRadius(), 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
