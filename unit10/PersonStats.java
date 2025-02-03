import java.util.*; 

public class PersonStats{
     public static double averagePet(ArrayList<Person> pets) {
        double sum = 0;

        for (Person a : pets) {
            sum += a.getPet();
        }

        return sum / pets.size();
    }
    
 public static Person mostPets (ArrayList<Person> pets) {
        Person toomanypets = pets.get(0);

        for (Person a : pets) {
            if (a.getPet() > toomanypets.getPet()) {
                toomanypets = a;
            }
        }
        return toomanypets;
    }
public static Person twoPets (ArrayList<Person> pets) {
    for (Person a : pets) {
            if (a.getPets() >= 2) {
                return person;
            }
        }
}