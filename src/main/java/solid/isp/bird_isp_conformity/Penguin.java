package solid.isp.bird_isp_conformity;

public class Penguin implements SwimBird{
    @Override
    public void swim() {
        System.out.println("Realization");
    }
}
