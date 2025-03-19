//Task 1
class Car {
    String brand;
    String model;
    double price;

    // Constructor to initialize Car details
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Corolla", 25000);
        
        // Displaying car information
        myCar.displayCar();
    }
}
