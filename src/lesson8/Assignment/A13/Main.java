package lesson8.Assignment.A13;

public class Main {
    public static void main(String[] args) {
        //Temperature Sensor
        TemperatureSensor temperature = new TemperatureSensor();
        temperature.measure();
        temperature.calibrate();

        System.out.println();

        //Pressure Sensor
        PressureSensor pressure = new PressureSensor();
        pressure.measure();
        pressure.calibrate();        
    }
}
