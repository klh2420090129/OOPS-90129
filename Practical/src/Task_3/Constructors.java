package Task_3;
class Car {
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Car myCar = new Car("Hyundai i20", 2023);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}
