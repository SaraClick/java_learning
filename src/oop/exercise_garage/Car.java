package oop.exercise_garage;

public class Car extends Vehicle{

    private int seats;

    public Car() {
        super();
    }

    public Car(String brand, String owner, int seats) {
        super(brand, owner);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public double calcBill() {
        return 65;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String toString() {
        return super.toString() + ", seats=" + this.getSeats();
    }
}
