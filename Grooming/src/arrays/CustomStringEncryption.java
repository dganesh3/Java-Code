package arrays;
public class CustomStringEncryption {

    public static String encryptString(String input) {
        // Check if the input contains only lowercase letters
        if (!input.matches("[a-z]+")) {
            throw new IllegalArgumentException("Input contains non-lowercase letters");
        }

        StringBuilder encryptedString = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Calculate the new character by shifting the current character
            int shiftAmount = i + 1; // Shift by index + 1
            char encryptedChar = (char) ((currentChar - 'a' + shiftAmount) % 26 + 'a');

            // Append the encrypted character to the result
            encryptedString.append(encryptedChar);
        }

        // Return the final encrypted string
        return encryptedString.toString();
    }

    public static void main(String[] args) {
        // Example usage
        try {
            String input = "abcdef";
            String encrypted = encryptString(input);
            System.out.println("Encrypted String: " + encrypted);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}