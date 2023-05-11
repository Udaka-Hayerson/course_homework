package solid.lsp.parent_child_lsp;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.doSmth();

        Child c = new Child();
        c.doSmth();
    }
}
