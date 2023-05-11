package solid.isp.bird_isp_conformity;

public class BirdTest {
    public static void main(String[] args) {
        Swan swan = new Swan();
        Swallow swallow = new Swallow();
        Strauss strauss = new Strauss();
        Penguin penguin = new Penguin();
        penguin.swim();
        strauss.run();
        swallow.fly();
        swan.swim();
        swan.run();
        swan.fly();

    }
}
