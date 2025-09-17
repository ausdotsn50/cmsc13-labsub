public class Object {
    private boolean isBlockingLight;
    private String shape;
    private String name;

    public Object(boolean isBlockingLight, String shape, String name) {
        this.isBlockingLight = isBlockingLight;
        this.shape = shape;
        this.name = name;
    }

    public boolean getIsBlockingLight() {
        return isBlockingLight;
    }

    public String getshape() {
        return shape;
    }

    public String getName() {
        return name;
    }

}
