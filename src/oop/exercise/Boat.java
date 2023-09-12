package oop.exercise;

public class Boat extends Vehicle {

    private boolean hasSail;

    public Boat() {
        super();
    }

    public Boat(String brand, String owner, boolean hasSail) {
        super(brand, owner);
        this.hasSail = hasSail;
    }

    public boolean isHasSail() {
        return hasSail;
    }

    @Override
    public double calcBill() {
        return 350;
    }

    public void setHasSail(boolean hasSail) {
        this.hasSail = hasSail;
    }

    public String toString() {
        return super.toString() + ", hasSail=" + this.isHasSail();
    }
}
