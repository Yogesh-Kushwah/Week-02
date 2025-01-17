class PalindromeChecker {

    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters symmetrically
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void display() {
        System.out.println("Is the given string a Palindrome? " + isPalindrome());
    }
}

public class Pallidrome {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker("Yogesh"); // Example input
        palindromeChecker.display();
    }
}
