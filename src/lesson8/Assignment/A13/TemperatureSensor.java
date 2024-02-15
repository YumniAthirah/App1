package lesson8.Assignment.A13;

public class TemperatureSensor implements Sensor{
    private double offset = 1.0;
    private double temp = Math.random()*100 + offset;

    @Override
    public void measure() {
        System.out.printf("Temperature: %.1fC\n", temp);
    }

    @Override
    public void calibrate() {
        double calibrated = temp - offset;
        System.out.printf("Calibrated temperature: %.1fC\n", calibrated);
        System.out.printf("Offset: %.1fC\n", offset);
        System.out.println("The sensor is calibrated");
    }
    
}
