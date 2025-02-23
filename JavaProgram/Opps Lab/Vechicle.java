public class Vehicle {
    public static void main(String[] args) {
        VehicleBase[] vehicles = new VehicleBase[2];

        vehicles[0] = new LightVehicle("Nano", 1212, 20, 25);
        vehicles[1] = new HeavyVehicle("Fortuner", 1234, 50, 10, 250);

        for (VehicleBase vehicle : vehicles) {
            vehicle.show();
            System.out.println(); 
        }
    }
}

class VehicleBase {
    String name;
    int num;

    VehicleBase(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void show() {
        System.out.println("Name of the Vehicle: " + this.name);
        System.out.println("No of Vehicle: " + this.num);
    }
}

class LightVehicle extends VehicleBase {
    int capacity;
    float mileage; 

    LightVehicle(String name, int num, int capacity, float mileage) {
        super(name, num);
        this.capacity = capacity;
        this.mileage = mileage;
    }

    @Override
    void show() {
        super.show(); 
        System.out.println("Vehicle Capacity: " + this.capacity);
        System.out.println("Vehicle Mileage: " + this.mileage);
    }
}

class HeavyVehicle extends VehicleBase {
    int capacity;
    float mileage;
    float tax;

    HeavyVehicle(String name, int num, int capacity, float mileage, float tax) {
        super(name, num);
        this.capacity = capacity;
        this.mileage = mileage;
        this.tax = tax;
    }

    @Override
    void show() {
        super.show(); 
        System.out.println("Vehicle Capacity: " + this.capacity);
        System.out.println("Vehicle Mileage: " + this.mileage);
        System.out.println("Vehicle Tax: " + this.tax);
    }
}
