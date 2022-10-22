package GroupProject3;

public class Task03 {
    public static void main(String[] args) {
        Sedan objSedan1 = new Sedan(23000, 15); //20,700 ((length < 20, 10% discount)
        Sedan objSedan2 = new Sedan(23000, 25); //21,850 (length > 20, 5% discount)
        Truck objTruck1 = new Truck(45000, 2000); // 36,000 (weight < 2000, 20% discount)
        Truck objTruck2 = new Truck(45000, 2500); //40,500 (weight > 2000, 10% discount)
        System.out.println("The price of this Sedan is " + objSedan1.calculateSalePrice());
        System.out.println("The price of this Sedan is " + objSedan2.calculateSalePrice());
        System.out.println("The price of this Truck is " + objTruck1.calculateSalePrice());
        System.out.println("The price of this Truck is " + objTruck2.calculateSalePrice());
    }
}

abstract class Car {
    double carPrice;
    String color;

    Car(double carPrice) {
        this.carPrice = carPrice;
    }

    abstract double calculateSalePrice();
}

class Sedan extends Car {

    double length;

    Sedan(double carPrice, double length) {
        super(carPrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return 0.95 * carPrice;
        } else {
            return 0.90 * carPrice;
        }
    }
}

class Truck extends Car {
    double weight;

    Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return 0.90 * carPrice;
        } else {
            return 0.80 * carPrice;
        }
    }
}