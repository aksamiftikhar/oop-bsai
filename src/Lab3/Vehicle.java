package Lab3;

public class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor with brand only
    public Vehicle(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = -1;
    }

    // Constructor with brand and model
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = -1;
    }

    // Constructor with brand, model, and year
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    public Vehicle makeCopy()
    {
        return this;
    }
    public boolean equals(Vehicle vehicle2) {
//        if (this == vehicle2) return true;

        if (year != vehicle2.year) return false;
        if (!brand.equals(vehicle2.brand)) return false;
        return model.equals(vehicle2.model);
    }
}
class VehicleTest {
    public static void main(String[] args) {
        // Experiment 1 Test code
        // Create vehicles using different constructors
        Vehicle v1 = new Vehicle("Toyota");
        Vehicle v2 = new Vehicle("Honda", "Civic");
        Vehicle v3 = new Vehicle("Ford", "Mustang", 2020);
        Vehicle v4 = v3.makeCopy();
        v4.brand = "My brand";


        // Display the details of each vehicle
//        v1.displayVehicleInfo();
//        v2.displayVehicleInfo();
        v3.displayVehicleInfo();
        v4.displayVehicleInfo();
        // Experiment 3 Test code
//        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020);
//        Vehicle car2 = new Vehicle("Toyota", "Camry", 2020);
//        Vehicle car3 = new Vehicle("Honda", "Accord", 2019);
//
//        // Check if two vehicles are equal using the overridden equals method
//        System.out.println("Are car1 and car2 equal? " + car1.equals(car2));  // Expected: true
//        System.out.println("Are car1 and car3 equal? " + car1.equals(car3));  // Expected: false
    }
}
