package PangramChecker;

import java.util.stream.Collectors;

public class PangramChecker {
    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram1));
    }

    public static boolean check(String sentence) {
        //code
        return (long) sentence
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase()
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toSet())
                .size() == 26;
    }
}
