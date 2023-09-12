package oop.practice;

import java.time.LocalDate;

public class Paye extends Employee{
    private String dept;
    private double salaryGross;

    public Paye(){}; // Default constructor
    public Paye(String name, String dob, String postcode, String dept, double salaryGross) {
        super(name, dob, postcode);
        this.dept = dept;
        this.salaryGross = salaryGross;
    }

    // Setters and getters
    public void setSalaryGross(double salaryGross){
        this.salaryGross = salaryGross;
    }

    public double getSalaryGross(){
        return salaryGross;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public double getNetSalary(){
        if (salaryGross > 60000) {
            return this.getSalaryGross()*0.6;
        } else {
            return this.getSalaryGross()*0.65;
        }
    }

    @Override
    public String toString() {
        return "PAYE employee = > " + super.toString() + " || dept: " + this.dept + " || grossSalary: " + this.getSalaryGross();
    }

}
