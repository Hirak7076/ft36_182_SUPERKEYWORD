package SUPERKEY;

public class Car extends Vehicle {

	private String model;

    // Constructor to initialize make, year, and model
    public Car(String make, int year, String model) {
        super(make, year); // Call the constructor of the parent class
        this.model = model;
    }

    // Override the displayDetails() method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails() method of the parent class
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2021, "Camry");
        myCar.displayDetails();
    }
}
