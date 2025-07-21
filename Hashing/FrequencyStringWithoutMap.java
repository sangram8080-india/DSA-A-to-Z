import java.util.HashMap;
import java.util.Map;
public class FrequencyStringWithoutMap {
    public static int[] frequencyString(String input) {
        int[] hash = new int[256]; // Assuming ASCII characters
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                hash[c]++;
            }
        }
        return hash;
    }public static void printFrequency(int[] hash) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
               freqMap.put((char) i, hash[i]);
            }
        }
    }
    public static void main(String[] args) {
        String input = "hello world";
        int[] hash = frequencyString(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println("'" + (char) i + "': " + hash[i]);
            }
        }

    }
}