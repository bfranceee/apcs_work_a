import java.util.*;

public class AnimalCalculator {

    public static void AnimalFur(List<Animal> animals) {
        for (Animal animal : animals) {
            String furry;
            if (animal.isFurry()) {
                furry = "furry";
            } else {
                furry = "not furry";
            }
            System.out.println(animal.getName() + " has " + animal.getLegCount() + " legs and is " + furry);
        }
    }

    public static double averageLegCount(List<Animal> animals) {
        int totalLegs = 0;
        for (Animal animal : animals) {
            totalLegs += animal.getLegCount();
        }
        return (double) totalLegs / animals.size();
    }

    public static Animal fewestLegs(List<Animal> animals) {
        Animal fewestLegsAnimal = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getLegCount() < fewestLegsAnimal.getLegCount()) {
                fewestLegsAnimal = animal;
            }
        }
        return fewestLegsAnimal;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Human("John"));
        animals.add(new Cat("Whiskers"));
        animals.add(new Sponge("Spongy"));
        animals.add(new Centipede("Centi"));

        AnimalCalculator.AnimalFur(animals);

        System.out.println("Average leg count: " + AnimalCalculator.averageLegCount(animals));

        System.out.println("Animal with fewest legs: " + AnimalCalculator.fewestLegs(animals).getName());
    }
}