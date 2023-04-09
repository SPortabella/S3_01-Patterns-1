package classes;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("The car " + getName() + " -> accelerate");
    }

    @Override
    public void start() {
        System.out.println("The car " + getName() + " -> start");
    }

    @Override
    public void brake() {
        System.out.println("The car " + getName() + " -> brake");
    }

}
