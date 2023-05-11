package solid.ocp.shape_ocp_conformity;

public class Rectangle extends Shape{
    private int width;
    private int height;
    private double area;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = area();
    }

    @Override
    public double area() {
        return this.getWidth() * this.getHeight();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
