package classes;

public class Ship extends Vehicle{

    public Ship(String name) {

        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("The ship " + getName() + " -> accelerate");
    }

    @Override
    public void start() {
        System.out.println("The ship " + getName() + " -> start");
    }

    @Override
    public void brake() {
        System.out.println("The ship " + getName() + " -> brake");
    }


}
