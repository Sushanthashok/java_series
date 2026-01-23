package Suskkoo;

class Car {
    String brand;
    String model;
    int price;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class obj {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Innova";
        c1.price = 1000000;

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "City";
        c2.price = 1200000;

        // Display details
        System.out.println("Car 1 Details:");
        c1.display();

        System.out.println("\nCar 2 Details:");
        c2.display();

        // Compare prices
        if (c1.price > c2.price) {
            System.out.println("\nCar 1 is more expensive than Car 2");
        } 
        else if (c1.price < c2.price) {
            System.out.println("\nCar 2 is more expensive than Car 1");
        } 
        else {
            System.out.println("\nBoth cars have the same price");
        }
    }
}
