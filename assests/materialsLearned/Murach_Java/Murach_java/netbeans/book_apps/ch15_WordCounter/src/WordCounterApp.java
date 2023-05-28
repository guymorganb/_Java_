import java.util.TreeMap;

public class WordCounterApp {

    public static void main(String[] args) {
        System.out.println("The Word Counter application\n");

        // define a string that contains text
        String text = "To be or not to be, that is the question.";
        
        // process the string
        text = text.replace(",", "")   // remove commas
                   .replace(".", "")   // remove periods
                   .toLowerCase();     // convert to lower case
    
        // split the string into an array
        String[] words = text.split(" ");

        // define a map and fill it with words and their counts
        var wordMap = new TreeMap<String,Integer>();
        int count;
        for (String word : words) {
            if (wordMap.containsKey(word)) {        // word is in map
                count = wordMap.get(word);
                count++;
                wordMap.put(word, count);
            } else {                                // new word for map
                wordMap.put(word, 1);
            }
        }        

        // print the entries
        for (var entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
