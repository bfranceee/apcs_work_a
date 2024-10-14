public class greeTings {
    public static String greetingHello (String str) {
        return("Greetings, " + str + "! How are you?");
}
    public static void testgreetingHello(String str)
    {
        System.out.println("Greetings, " + str + "! How are you?");
    }
 public static void main(String[] args) {
     System.out.println("Hello, world!");
     
     testgreetingHello("Briley");
     testgreetingHello("Dr. Kessner");
 }
}