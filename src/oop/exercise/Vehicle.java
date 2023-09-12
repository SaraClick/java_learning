package oop.exercise;

public abstract class Vehicle {

    private String brand;
    private String owner;
    private int id;

    // Constructor
    public Vehicle(String brand, String owner) {
        this.brand = brand;
        this.owner = owner;
    }

    public Vehicle() {
    };// Default constructor


    // abstract class to calculate garage bill
    public abstract double calcBill();


    // Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle =>> " +
                "brand='" + this.getBrand() + '\'' +
                ", owner=" + this.getOwner() + '\'' +
                ", id=" + id;
    }

}
