public class PalindromeChecker {
    // Attribute to store the text
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedText = text.replaceAll("\\s", "").toLowerCase();

        // Compare the original string with its reverse
        StringBuilder reversedText = new StringBuilder(cleanedText).reverse();
        return cleanedText.equals(reversedText.toString());
    }

    // Method to display the result of palindrome check
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
 
  // Main method for testing
class Main{
    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Create PalindromeChecker objects
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        // Display results
        checker1.displayResult();  // Should print that "Madam" is a palindrome
        checker2.displayResult();  // Should print that "Hello" is not a palindrome
    }
}

