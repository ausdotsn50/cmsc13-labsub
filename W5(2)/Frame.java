public class Frame {
    private boolean isDestroyed;
    private float weight;

    public Frame(boolean isDestroyed, float weight) {
        this.isDestroyed = isDestroyed;
        this.weight = weight;
    }

    public boolean getIsDestroyed() {
        return isDestroyed;
    }

    public float getWeight() {
        return weight;
    }

    public void displayDetails() {
        // Frame details
        System.out.println("         - Frame ID: " + this);
        System.out.println("           * Weight: " + this.getWeight() + " kg");
        System.out.println("           * Status: " + (this.getIsDestroyed() ? "Destroyed" : "Functional"));
    }

}
