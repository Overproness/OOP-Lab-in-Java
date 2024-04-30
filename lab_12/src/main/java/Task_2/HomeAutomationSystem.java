// M. Muntazar
// 470861
// BSDS-1A

package Task_2;

class LightBulb implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is off");
    }
}

class Thermostat implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is heating");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is off");
    }
}

class Fan implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

public class HomeAutomationSystem {
    public static void main(String[] args) {
        Controllable[] devices = new Controllable[]{
                new LightBulb(),
                new Thermostat(),
                new Fan()
        };

        for (Controllable device : devices) {
            System.out.println("Turning on the device:");
            device.turnOn();
            System.out.println("Turning off the device:");
            device.turnOff();
            System.out.println();
        }
    }
}