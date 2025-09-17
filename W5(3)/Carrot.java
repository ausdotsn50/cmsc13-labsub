public class Carrot extends Vegetable {
    private boolean isBabyCarrot;
    private float betaCaroteneContent;

    public Carrot(float waterContent, float fiberContent, boolean isBabyCarrot, float betaCaroteneContent) {
        super(waterContent, fiberContent);
        this.isBabyCarrot = isBabyCarrot;
        this.betaCaroteneContent = betaCaroteneContent;
    }

    public void peel() {
        System.out.println("Peeling the carrot...");
    }

    @Override
    public void displayInfo() {
        System.out.println("\n===== 🥕 Carrot Information =====");
        super.displayInfo();
        System.out.printf("  • Baby Carrot: %s%n", (isBabyCarrot ? "Yes" : "No"));
        System.out.printf("  • Beta-Carotene Content: %.2f mg per 100g%n", betaCaroteneContent);
        System.out.println("================================\n");
    }
}