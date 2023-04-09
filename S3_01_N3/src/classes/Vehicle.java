package classes;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void accelerate();
    public abstract void start();
    public abstract void brake();

}
