package solid.ocp.shape_ocp_conformity;
public class Triangle extends Shape{
    long a, b, c;
    double area;

    public Triangle(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.area = area();
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
