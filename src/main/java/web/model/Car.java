package web.model;


public class Car {
    private String model;
    private int maxSpeed;
    private String type;


    public Car() {
    }

    public Car(String model, int maxSpeed, String type) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
