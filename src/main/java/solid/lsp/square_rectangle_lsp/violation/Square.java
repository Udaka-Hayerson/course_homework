package solid.lsp.square_rectangle_lsp.violation;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void widthMutation(int mutation) {
        this.width *= mutation;
        this.height *= mutation;
    }

    @Override
    public void heightMutation(int mutation) {
        this.height *= mutation;
        this.width *= mutation;
    }
}
