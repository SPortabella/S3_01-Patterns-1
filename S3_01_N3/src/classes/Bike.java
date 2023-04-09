package classes;


public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("The bike " + getName() + " -> accelerate");
    }

    @Override
    public void start() {
        System.out.println("The bike " + getName() + " -> start");
    }

    @Override
    public void brake() {
        System.out.println("The bike " + getName() + " -> brake");
    }

}
