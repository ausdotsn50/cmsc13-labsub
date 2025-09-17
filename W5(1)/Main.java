public class Main {
    public static void main(String[] args) {
        Light light = new Light("Yellow");
        
        light.generateShadow(new Object(true, "Bag-shaped", "Bag"));
        light.generateShadow(new Object(true, "Square", "Big Box"));
        light.generateShadow(new Object(false, "Circle", "Ball"));
    }
}
