package oop.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Employee {

    // Class attributes
    private String name;
    private LocalDate dob;  // Pattern dd-M-yyyy
    private String postcode;

    // Constructors
    public Employee() {}; // default

    public Employee(String name, String dob, String postcode){
        // setting dob from string to LocalDate
        LocalDate localDate = LocalDate.parse(dob);

        this.name = name;
        this.dob = localDate;
        this.postcode = postcode;
    }

    // Setter and getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    // Abstract method
    public abstract double getNetSalary();

    public String toString(){
        return "Employee =>> name: " + this.getName() + " || dob: " + this.getDob() + " || postode: " + this.getPostcode();
    }

}
