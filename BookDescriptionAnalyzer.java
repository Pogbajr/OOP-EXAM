import java.util.Scanner;

public class BookDescriptionAnalyzer {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt librarian for book description
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();
        
        // Close scanner
        scanner.close();
        
        // Convert description to lowercase for case-insensitive counting
        String lowerDescription = description.toLowerCase();
        String target = "uganda";
        
        // Initialize counter
        int count = 0;
        int index = 0;
        
        // Loop to find all occurrences of "uganda"
        while ((index = lowerDescription.indexOf(target, index)) != -1) {
            count++;
            index += target.length(); // Move index past the current match
        }
        
        // Output the result
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
    }
}