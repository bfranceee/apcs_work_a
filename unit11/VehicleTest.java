import java.util.List;

class VehicleTest {
    public static int totalWheels(List<Vehicle> vehicles) {
        int total = 0;
        for (Vehicle v : vehicles) {
            total += v.wheelCount(); // Updated method call
        }
        return total;
    }

    public static List<Vehicle> humanPoweredVehicles(List<Vehicle> vehicles) {
        List<Vehicle> humanPowered = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.isHumanPowered()) {
                humanPowered.add(v);
            }
        }
        return humanPowered;
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bicycle());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Unicycle());

        System.out.println("Total wheels: " + VehicleTest.totalWheels(vehicles));

        List<Vehicle> humanPowered = VehicleTest.humanPoweredVehicles(vehicles);
        System.out.println("Human-powered vehicles:");
        for (Vehicle vehicle : humanPowered) {
            System.out.println(vehicle.getName());
        }
    }
}