import classes.Bike;
import classes.Car;
import classes.Plane;
import classes.Ship;
import commands.BrakeCommand;
import commands.AccelerateCommand;
import commands.StartCommand;

public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship("motorboat");
        StartCommand startCommand = new StartCommand(ship);
        AccelerateCommand accelerateCommand = new AccelerateCommand(ship);
        BrakeCommand brakeCommand = new BrakeCommand(ship);

        Bike bike = new Bike("BH");
        StartCommand startCommand1 = new StartCommand(bike);
        AccelerateCommand accelerateCommand1 = new AccelerateCommand(bike);
        BrakeCommand brakeCommand1 = new BrakeCommand(bike);

        Car car = new Car("opel");
        StartCommand startCommand2 = new StartCommand(car);
        AccelerateCommand accelerateCommand2 = new AccelerateCommand(car);
        BrakeCommand brakeCommand2 = new BrakeCommand(car);

        Plane plane = new Plane("concord");
        StartCommand startCommand3 = new StartCommand(plane);
        AccelerateCommand accelerateCommand3 = new AccelerateCommand(plane);
        BrakeCommand brakeCommand3 = new BrakeCommand(plane);

        VehicleExecutor vehicleExecutor = new VehicleExecutor();

        vehicleExecutor.executeOperation(startCommand);
        vehicleExecutor.executeOperation(accelerateCommand);
        vehicleExecutor.executeOperation(brakeCommand);

        vehicleExecutor.executeOperation(startCommand1);
        vehicleExecutor.executeOperation(accelerateCommand1);
        vehicleExecutor.executeOperation(brakeCommand1);

        vehicleExecutor.executeOperation(startCommand2);
        vehicleExecutor.executeOperation(accelerateCommand2);
        vehicleExecutor.executeOperation(brakeCommand2);

        vehicleExecutor.executeOperation(startCommand3);
        vehicleExecutor.executeOperation(accelerateCommand3);
        vehicleExecutor.executeOperation(brakeCommand3);

    }
}