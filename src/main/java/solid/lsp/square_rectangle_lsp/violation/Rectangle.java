package solid.lsp.square_rectangle_lsp.violation;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void area(){
        System.out.println(" " + width + " " + height + " " + (width * height));
    }
    public void widthMutation(int mutation){
        this.width *= mutation;
    }
    public void heightMutation(int mutation){
        this.height *= mutation;
    }
}
