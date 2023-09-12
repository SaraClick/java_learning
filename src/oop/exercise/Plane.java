package oop.exercise;

public class Plane extends Vehicle {

    private boolean commercial;

    public Plane() {
        super();
    }


    public Plane(String brand, String owner, boolean commercial) {
        super(brand, owner);
        this.commercial = commercial;
    }


    public boolean isCommercial() {
        return commercial;
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }


    public String toString() {
        return super.toString() + ", commercial=" + this.isCommercial();
    }
}
