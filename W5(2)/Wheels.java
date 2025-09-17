public class Wheels {
    private boolean isDestroyed;
    private float diameter;

    public Wheels(boolean isDestroyed, float diameter) {
        this.isDestroyed = isDestroyed;
        this.diameter = diameter;
    }

    public boolean getIsDestroyed() {
        return isDestroyed;
    }

    public float getDiameter() {
        return diameter;
    }

    public void displayDetails() {
        // Wheels details
        System.out.println("         - Wheels ID: " + this);
        System.out.println("           * Diameter: " + this.getDiameter() + " inches");
        System.out.println("           * Status: " + (this.getIsDestroyed() ? "Destroyed" : "Functional"));
    }
}
