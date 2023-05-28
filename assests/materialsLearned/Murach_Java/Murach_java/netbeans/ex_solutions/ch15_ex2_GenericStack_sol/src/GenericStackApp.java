public class GenericStackApp {

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        // push three items onto the stack
        stack.push("Apples");
        System.out.println("Push: " + stack.peek());
        stack.push("Oranges");
        System.out.println("Push: " + stack.peek());
        stack.push("Bananas");
        System.out.println("Push: " + stack.peek());
        System.out.println("The stack contains " + stack.size() + " items\n");

        // peek at the first item
        System.out.println("Peek: " + stack.peek());
        System.out.println("The stack contains " + stack.size() + " items\n");

        // pop all three items
        while (stack.size() > 0) {
            System.out.println("Pop: " + stack.pop());
        }
        System.out.println("The stack contains " + stack.size() + " items\n");
    }
    
}
