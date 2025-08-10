import java.util.ArrayList;
public class Runner {
    private ArrayList<Vehicle> vehicles;
     public Runner() {
            vehicles = new ArrayList<>();
        }
        public static void main(String[] args) {
            Runner runner = new Runner();
            // Create 2 Bike objects and add them to the ArrayList
            Bike bike1 = new Bike("Yamaha", "YZF-R3", 5000.00, "Yamaha");
            Bike bike2 = new Bike("Kawasaki", "Ninja 400", 6000.00, "Kawasaki");
            runner.vehicles.add(bike1);
            runner.vehicles.add(bike2);
            // Create 2 Car objects and add them to the ArrayList
            Car car1 = new Car("Toyota", "Corolla", 6);
            Car car2 = new Car("Honda", "Civic", 5);
            runner.vehicles.add(car1);
            runner.vehicles.add(car2);
            // Iterate over the ArrayList and print values
            for (Vehicle vehicle : runner.vehicles) {
                if (vehicle instanceof Bike) {
                    Bike bike = (Bike) vehicle;
                    System.out.println("Bike Name: " + bike.getName() + ", Model No: " + bike.getModelNo() +
                            ", Price: " + bike.getPrice() + ", Company: " + bike.getCompany());
                } else if (vehicle instanceof Car) {
                    Car car = (Car) vehicle;
                    System.out.println("Car Name: " + car.getName() + ", Model No: " + car.getModelNo() +
                            ", No of Gears: " + car.getNoOfGears());
                }
            }
        }
}
