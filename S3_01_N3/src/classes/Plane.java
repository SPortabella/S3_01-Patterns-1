package classes;

public class Plane extends Vehicle {

    public Plane(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("The plane " + getName() + " -> accelerate");
    }

    @Override
    public void start() {
        System.out.println("The plane " + getName() + " -> start");
    }

    @Override
    public void brake() {
        System.out.println("The plane " + getName() + " -> brake");
    }
}
