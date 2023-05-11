package solid.isp.bird_isp_conformity;

public class Swan implements Bird{
    @Override
    public void fly() {
        System.out.println("Realization");
    }

    @Override
    public void run() {
        System.out.println("Realization");
    }

    @Override
    public void swim() {
        System.out.println("Realization");
    }
}
