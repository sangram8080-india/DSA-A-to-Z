import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) continue;
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}