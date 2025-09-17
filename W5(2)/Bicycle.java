public class Bicycle {
    protected Frame frame;
    protected Wheels wheels;
    private String type;

    public Bicycle(Frame frame, Wheels wheels, String type) {
        this.frame = frame;
        this.wheels = wheels;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // No need to check if a component is destroyed
    // Main file does not let proceed creating an instance of a new bike on non-func comp 
    public void startCycling() {
        System.out.println("You hop on your " + type + " and start pedaling...");
        System.out.println("Pedal... pedal... pedal... gaining speed!");
    }

    public void applyBrakes() {
        System.out.println("Squeeeeak! Bicycle slowing down...");
    }

    public void stopCycling() {
        System.out.println("You stop pedaling and bring the " + type + " to a complete stop.");
        System.out.println("The ride on your " + type + " has ended.");
    }
}
