import java.util.Scanner;
import java.util.HashMap;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, String> responses = new HashMap<>();
        
        responses.put("hi", "Hello! How can I help you today?");
        responses.put("hello", "Hi there! What's on your mind?");
        responses.put("who are you", "I am a simple AI Chatbot created for CodeAlpha task.");
        responses.put("how are you", "I'm doing great! Ready to assist you.");
        responses.put("what is java", "Java is a popular high-level programming language.");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("time", "Current time is " + java.time.LocalTime.now());
        responses.put("date", "Today's date is " + java.time.LocalDate.now());
        responses.put("name", "My name is CodeAlpha Bot, your virtual assistant.");
        responses.put("thank you", "You're welcome! Happy to help.");
        System.out.println("--- CodeAlpha AI Chatbot ---");
        System.out.println("(Type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: " + responses.get("bye"));
                break;
            }

            
            boolean found = false;
            for (String key : responses.keySet()) {
                if (input.contains(key)) {
                    System.out.println("Bot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bot: I'm sorry, I don't understand that yet. Can you try asking something else?");
            }
        }
        sc.close();
    }
}