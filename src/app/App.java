package app;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Red", "T");
        System.out.println(Car.numberOfCars);
    }
}