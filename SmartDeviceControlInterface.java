interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

public class SmartDeviceControlInterface {
    public static void main(String[] args) {
        SmartDevice tv = new Light();
        tv.turnOn();
        tv.turnOff();
    }
}
