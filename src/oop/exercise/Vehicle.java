package oop.exercise;

public class Vehicle {

    private String environment;
    private int wheels;
    private float speed;
    private int id;

    // Constructor
    public Vehicle(String environment, int wheels, float speed) {
        this.environment = environment;
        this.wheels = wheels;
        this.speed = speed;
    }

    public Vehicle() {
    };// Default constructor




    // Getters and Setters

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "environment='" + environment + '\'' +
                ", wheels=" + wheels +
                ", seats=" + speed + ", id=" + id +
                '}';
    }
}
