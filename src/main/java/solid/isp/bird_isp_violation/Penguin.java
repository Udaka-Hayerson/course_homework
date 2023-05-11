package solid.isp.bird_isp_violation;

public class Penguin implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println("Realization");
    }
}
