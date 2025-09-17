public class Shadow {
    private String shape;
    private Light lightSource;

    // Assume shadow shape the same as shape of object (blocking the light)
    public Shadow(String shape, Light lightSource) {
        this.shape = shape;
        this.lightSource = lightSource;
    }

    public String getShape() {
        return shape;
    }

    public Light getLightSource() {
        return lightSource;
    }

    // Shadow cannot generate light
}
