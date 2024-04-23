package Task_3;

// Define abstract base class Robot
abstract class Robot {
    String name;

    // Constructor
    public Robot(String name) {
        this.name = name;
    }

    // Abstract method performTask
    abstract void performTask();
}

// Concrete subclass for cleaning robots
class CleaningRobot extends Robot {
    // Constructor
    public CleaningRobot(String name) {
        super(name);
    }

    // Implementation of performTask method for cleaning robots
    @Override
    void performTask() {
        System.out.println(name + " is cleaning floors.");
    }
}

// Concrete subclass for delivery robots
class DeliveryRobot extends Robot {
    // Constructor
    public DeliveryRobot(String name) {
        super(name);
    }

    // Implementation of performTask method for delivery robots
    @Override
    void performTask() {
        System.out.println(name + " is delivering packages.");
    }
}

// Concrete subclass for security robots
class SecurityRobot extends Robot {
    // Constructor
    public SecurityRobot(String name) {
        super(name);
    }

    // Implementation of performTask method for security robots
    @Override
    void performTask() {
        System.out.println(name + " is monitoring security.");
    }
}

// Main class to demonstrate polymorphism
public class RobotSimulationSystem {
    public static void main(String[] args) {
        // Create an array of Robot objects
        Robot[] fleet = {
            new CleaningRobot("CleanerBot1"),
            new DeliveryRobot("DeliveryBot1"),
            new SecurityRobot("SecurityBot1")
        };

        // Loop through the array and call the performTask method for each robot
        for (Robot robot : fleet) {
            robot.performTask();
        }
    }
}

