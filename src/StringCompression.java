
    
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) return;
        String s = sc.next();
        
        // Use StringBuilder for efficient string building
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;

            // If next character is different or we reached the end
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0; // Reset for the next unique character
            }
        }

        String result = compressed.toString();

        // Print the compressed string only if it's shorter than the original
        if (result.length() < s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}