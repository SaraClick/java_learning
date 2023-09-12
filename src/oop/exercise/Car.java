package oop.exercise;

public class Car extends Vehicle{

    private int seats;

    public Car() {
        super();
    }

    public Car(String environment, int wheels, float speed, int seats) {
        super(environment, wheels, speed);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String toString() {
        return super.toString() + ", seats=" + this.getSeats() + "}";
    }
}
