public class Person {
    
   public Person(String nameIn, int petsIn){
       name = nameIn;
       pets = petsIn;
   }
    public void greeting(){
        System.out.println("Hello, my name is " + name + " and I have " + pets + " pets.");
    }
    private String name;
    private int pets;
}
    