public class magicBallTest {
    public static void main(String[] args) {
        magicBall magicEightBall = new magicBall();
        System.out.println("Will I have a great day today?");
        System.out.println(magicEightBall.ask("Will I have a great day today?"));
        System.out.println("Will I win the lottery tomorrow?");
        System.out.println(magicEightBall.ask("Will I win the lottery tomorrow?"));
        System.out.println("Will I pass my exam?");
        System.out.println(magicEightBall.ask("Will I pass my exam?"));
    }
}