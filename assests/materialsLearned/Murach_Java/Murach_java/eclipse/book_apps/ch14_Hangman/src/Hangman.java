public class Hangman {
    private final Wordlist wordlist;
    private final String word;
    private final int wordLength;
    private int remainingLetters;
    private String displayedWord;
    private int numGuesses;
    private int numWrong;
    private String guessedLetters;
    
    public Hangman() {
        wordlist = new Wordlist();
        word = wordlist.getRandomWord().toUpperCase();
        wordLength = word.length();
        remainingLetters = wordLength;
        displayedWord = "_".repeat(wordLength);
        numGuesses = 0;
        numWrong = 0;
        guessedLetters = "";
    }
    
    public char getLetter() {
        while(true) {
            String prompt = "Enter a letter: ";
            String s = Console.getString(prompt).toUpperCase();
            
            if (s.length() == 1) {
                char c = s.charAt(0);
                if(Character.isLetter(c)) {
                    if(guessedLetters.indexOf(c) == -1) {
                        numGuesses++;
                        guessedLetters += c;
                        return c;
                    } else {
                        Console.displayLine("You already tried that letter.");
                        continue;
                    }
                }
            } 
            // if you're here, user didn't enter a single letter
            Console.displayLine("Please enter 1 and only 1 letter.");
        }
    }
    
    public void drawLine() {
        Console.displayLine("*".repeat(64));
    }
    
    public void drawScreen() {
        drawLine();
        String display = String.format(
            "Word: %s   Guesses: %d  Wrong: %d  Tried: %s", 
            wordlist.addSpaces(displayedWord), numGuesses, 
            numWrong, wordlist.addSpaces(guessedLetters));
        Console.displayLine(display);
    }
    
    public void playGame() {
        drawScreen();
        
        while(numWrong < 10 && remainingLetters > 0) {
            char guess = getLetter();
            int index = word.indexOf(guess);
            
            if(index == -1) {
                numWrong++;
            } else {
                displayedWord = "";
                remainingLetters = word.length();
                
                for(char c: word.toCharArray()){
                    if(guessedLetters.indexOf(c) == -1) {
                        displayedWord += "_";
                    } else {
                        displayedWord += c;
                        remainingLetters--;  //decrement remaining letters
                    }
                }
            }
            drawScreen();
        }
        drawLine();
        if(remainingLetters == 0) {
            Console.displayLine(String.format(
                "Congratulations! You got it in %d guesses.", numGuesses));
        } else {
            Console.displayLine(String.format(
                "Sorry, you lost. The word was %s.", word));
        }
    }
}
