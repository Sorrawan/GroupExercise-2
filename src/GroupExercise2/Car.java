package GroupExercise2;

public class Car {
    /*
    3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

     */

    double carPrice;
    String color;

    Car(double carPrice) {
        this.carPrice=carPrice;
    }
    void calculateSalePrice(double carPrice) {
        System.out.println(carPrice);;
    }
}
class Sedan extends Car {

    double length;

    Sedan(double carPrice, double length) {
        super(carPrice);
        this.length = length;
    }

    void calculateSalePrice(double carPrice, double length) {
        this.length = length;

        if (length > 20) {
            System.out.println(carPrice*.95);
        } else {
            System.out.println(carPrice*.9);
        }
    }
}
class Truck extends Car {
    double weight;
    Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }
    void calculateSalePrice(double carPrice, double weight) {
        if (weight > 2000) {
            System.out.println(carPrice * .9);
        } else {
            System.out.println(carPrice * .8);
        }
    }

    public static void main(String[] args) {

        Truck truck=new Truck(1000,3000);
        truck.calculateSalePrice(1000,1000);
        truck.calculateSalePrice(1000,3000);

        System.out.println("-------------------------------------------------");

        Sedan sedan=new Sedan(1000,30);
        sedan.calculateSalePrice(1000,25);
        sedan.calculateSalePrice(1000,15);

    }
}
