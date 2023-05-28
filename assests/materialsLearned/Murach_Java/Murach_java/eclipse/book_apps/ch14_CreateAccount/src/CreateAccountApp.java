public class CreateAccountApp {
    
    public static void main(String[] args) {
        String fullName = getFullName();
        Console.displayLine();
        
        String password = getPassword();
        Console.displayLine();
        
        String msg = getSuccessMessage(fullName);
        Console.displayLine(msg);
    }

    private static String getFullName() {
        while(true) {
            String prompt = "Enter full name:     ";
            String name = Console.getString(prompt).trim();
            if(name.indexOf(" ") == -1) {
                Console.displayLine("You must enter your full name.\n");
            } else {
                return name;
            }
        }
    }

    private static String getPassword() {
        while(true) {
            String prompt = "Enter password:      ";
            String password = Console.getString(prompt).trim();
            
            boolean hasDigit = false;
            boolean hasUppercase = false;
            boolean isMinLength = false;
            
            for (char c: password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
            }
            
            if (password.length() >= 8) {
                isMinLength = true;
            }
            
            if(hasDigit && hasUppercase && isMinLength) {
                return password;
            } else {
                Console.displayLine("Password must be 8 characters or more\n" 
                    + "with at least one digit and one uppercase letter.\n");
            }
        }
    }
    
    private static String getSuccessMessage(String fullName) {
        int index = fullName.indexOf(" ");
        String firstLetter = fullName.substring(0,1);
        
        // get and capitalize first name
        String firstName = firstLetter.toUpperCase() +  
            fullName.substring(1, index);
        
        return "Hi " + firstName + ", thanks for creating an account!\n";
    }
}
