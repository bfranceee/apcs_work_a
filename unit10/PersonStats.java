import java.util.*;

public class PersonStats {
    public static double averagePet(ArrayList<Person> pets) {
        double sum = 0;

        for (Person a : pets) {
            sum += a.getPet();
        }

        return sum / pets.size();
    }

    public static Person mostPets(ArrayList<Person> pets) {
        Person toomanypets = pets.get(0);

        for (Person a : pets) {
            if (a.getPet() > toomanypets.getPet()) {
                toomanypets = a;
            }
        }
        return toomanypets;
    }

    public static List<Person> peopleWithAtLeastTwoPets(ArrayList<Person> pets) {
        List<Person> result = new ArrayList<>();

        for (Person a : pets) {
            if (a.getPet() >= 2) { 
                result.add(a); 
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Person> pets = new ArrayList<>();

        pets.add(new Person("John", 2));
        pets.add(new Person("Piper", 4));
        pets.add(new Person("Molly", 6));

        System.out.println("Average number of pets: " + averagePet(pets));
        System.out.println("Person with most pets: " + mostPets(pets).getName());
        System.out.println("People with at least two pets:");
        for (Person person : peopleWithAtLeastTwoPets(pets)) {
            System.out.println(person.getName());
        }
    }
}