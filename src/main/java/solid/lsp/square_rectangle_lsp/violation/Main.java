package solid.lsp.square_rectangle_lsp.violation;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(4);
        rectangle.area();
        square.area();
        rectangle.widthMutation(3);
        rectangle.heightMutation(7);
        square.widthMutation(2);
        square.heightMutation(9);
        rectangle.area();
        square.area();
    }
}
