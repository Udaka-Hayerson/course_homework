package solid.lsp.parent_child_lsp;

public class Child extends Parent{
    @Override
    public void doSmth() {
        throw new RuntimeException();
    }
}
