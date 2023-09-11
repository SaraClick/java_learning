package oop;

public class Person {

    // attributes -> instance variables
    // don't need values
    // will default to either false/ /0/null
    private String name;

    private int age;

    private String job;

    private String hairColour;

    public String introduction() {
        return "Hello, my name is " + name + " and I am a " + age + " years old " + job + " with " + hairColour + " hair";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this -> current object
        // distinguishes instance variables from local variables
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 111) {
            System.out.println("Invalid age: " + age);
        } else {
            this.age = age;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
}
