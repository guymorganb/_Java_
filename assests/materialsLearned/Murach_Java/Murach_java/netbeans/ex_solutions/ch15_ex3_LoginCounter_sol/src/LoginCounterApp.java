import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class LoginCounterApp {
    private static Map<String, Integer> loginCounter = new TreeMap<>();
    
    public static void main(String[] args) {
        System.out.println("The Login Counter Application");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a username (q to quit): ");
            String username = sc.nextLine();
            if (username.equals("q")) {
                break;
            }
            login(username);
        }
        for (var entry : loginCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void login(String username) {
        if (loginCounter.containsKey(username)) {        // word is in map
            int count = (int) loginCounter.get(username);
            count++;
            loginCounter.put(username, count);
        } else {                                         // new word for map
            loginCounter.put(username, 1);
        }
    }
}
