public class HangmanApp {

    public static void main(String[] args) {
        Console.displayLine("Play the H A N G M A N game");
        String again = "y";
        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.playGame();
            Console.displayLine();
            again = Console.getString("Play again? (y/n): ");
        }
    } 
}
