package solid.lsp.square_rectangle_lsp.conformity;

public class Rectangle implements Shape{
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void area(){
        System.out.println(width * height);
    }
}
