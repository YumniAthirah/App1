package lesson13.example;

public class Truck implements VehicleTrait, ExtraFunctionalityTrait{

    @Override
    public void honk() {
        System.out.println("Truck honking");
    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    public static void main(String[] args) {
        VehicleTrait car = new Car();
        car.start();
        car.stop();
        
        VehicleTrait truck = new Truck();
        truck.start();
        truck.stop();

        ExtraFunctionalityTrait truckWithAlias = new Truck();
        truckWithAlias.honk();
    }
    
}
