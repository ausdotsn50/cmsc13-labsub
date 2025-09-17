public class Main {
    public static void main(String[] args) {
        Carrot carrot = new Carrot(2.3f, 5.6f, false, 1.8f);
        Cucumber cucumber = new Cucumber(2.9f, 3.2f, false, true);

        carrot.peel();
        cucumber.removeSeeds();

        carrot.displayInfo();
        cucumber.displayInfo();
    }
}