public class Vegetable {
    protected float waterContent;
    protected float fiberContent;

    public Vegetable(float waterContent, float fiberContent) {
        this.waterContent = waterContent;
        this.fiberContent = fiberContent;
    }

    public float getWaterContent() {
        return waterContent;
    }

    public float getFiberContent() {
        return fiberContent;
    }

    public void displayInfo() {
        System.out.println("Water Content: " + waterContent + "%");
        System.out.println("Fiber Content: " + fiberContent + " g per 100g");
    }
}
