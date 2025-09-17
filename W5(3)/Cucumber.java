public class Cucumber extends Vegetable {
    private boolean isSeedless;
    private boolean isPickled;

    public Cucumber(float waterContent, float fiberContent, boolean isSeedless, boolean isPickled) {
        super(waterContent, fiberContent);
        this.isSeedless = isSeedless;
        this.isPickled = isPickled;
    }

    public void removeSeeds() {
        if (isSeedless) {
            System.out.println("This cucumber is already seedless!");
        } else {
            System.out.println("Removing seeds from the cucumber...");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\n===== 🥒 Cucumber Information =====");
        super.displayInfo();
        System.out.println("  • Seedless: " + (isSeedless ? "Yes" : "No"));
        System.out.println("  • Pickled: " + (isPickled ? "Yes" : "No"));
        System.out.println("==================================\n");
    }
}