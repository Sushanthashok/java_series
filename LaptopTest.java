package Suskkoo;

class Laptop {
    String brand;
    int ram;
    int price;

    // Constructor
    Laptop(String b, int r, int p) {
        brand = b;
        ram = r;
        price = p;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM   : " + ram + "GB");
        System.out.println("Price : " + price);
        System.out.println();
    }
}

public class LaptopTest {
    public static void main(String[] args) {

        // Initializing values using constructor
        Laptop l1 = new Laptop("Dell", 8, 50000);
        Laptop l2 = new Laptop("HP", 16, 70000);

        l1.display();
        l2.display();
    }
}
