package oop.exercise;

public class Boat extends Vehicle {

    private boolean hasSail;

    public Boat() {
        super();
    }

    public Boat(String environment, int wheels, float speed, boolean hasSail) {
        super(environment, wheels, speed);
        this.hasSail = hasSail;
    }

    public boolean isHasSail() {
        return hasSail;
    }

    public void setHasSail(boolean hasSail) {
        this.hasSail = hasSail;
    }

    public String toString() {
        return super.toString() + ", hasSail=" + this.isHasSail() + "}";
    }
}
