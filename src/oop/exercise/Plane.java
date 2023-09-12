package oop.exercise;

public class Plane extends Vehicle {

    private boolean commercial;

    public Plane() {
        super();
    }


    public Plane(String environment, int wheels, float speed, boolean commercial) {
        super(environment, wheels, speed);
        this.commercial = commercial;
    }

    public boolean isCommercial() {
        return commercial;
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }


    public String toString() {
        return super.toString() + ", commercial=" + this.isCommercial() + "}";
    }
}
