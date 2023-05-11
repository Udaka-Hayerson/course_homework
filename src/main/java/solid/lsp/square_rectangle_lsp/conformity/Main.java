package solid.lsp.square_rectangle_lsp.conformity;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Rectangle rectangle1 = new Rectangle(3, 5);
        Square square = new Square(4);
        Shape[] shapes = {rectangle, rectangle1, square};
        for (var s : shapes) {
            s.area();
        }
    }
}
