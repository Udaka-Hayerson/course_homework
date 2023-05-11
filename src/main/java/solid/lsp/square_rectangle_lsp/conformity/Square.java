package solid.lsp.square_rectangle_lsp.conformity;

public class Square implements Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }
    public void area(){
        System.out.println(Math.pow(side, 2));
    }
}
