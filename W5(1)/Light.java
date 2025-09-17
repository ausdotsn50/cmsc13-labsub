public class Light {
    private final float minIntensity = 0;
    private final float maxIntensity = 100;

    private String color;
    private float intensityLevel = 0; // 0 light intensity by default
    
    public Light(String color) {
        this.color = color;
    }

    public float reduceIntensity(float reductionLevel) {
        if(intensityLevel - reductionLevel < minIntensity) {
            System.out.println("Minimum intensity reached, cannot reduce intensity.");
            return -1;
        }
        return intensityLevel -= reductionLevel;
    }

    public float increaseIntensity(float increaseLevel) {
        if(intensityLevel + increaseLevel > maxIntensity) {
            System.out.println("Maximum intensity reached, cannot increase intensity.");
            return -1;
        }
        return intensityLevel += increaseLevel;
    }

    // Light can generate shadow
    public void generateShadow(Object myObj) {
        if (myObj.getIsBlockingLight()) { // If the object is blocking the light at any angle
            Shadow objShadow = new Shadow(myObj.getshape(), this);

            System.out.println("[INFO] Generated shadow from object: '" + myObj.getName() + "'");
            System.out.println("       Shadow ID: " + objShadow);
            System.out.println("       Light Source: " + objShadow.getLightSource());
            System.out.println("       Shadow Shape: " + objShadow.getShape());
        }
        else {
            System.out.println("The object " + myObj.getName() + " is not blocking the light. No shadow to be generated.");
        }
    }

    public String getColor() {
        return color;
    }

}
