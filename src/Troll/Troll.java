package Troll;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("What are you, a communist?"));
    }

    public static String disemvowel(String str) {
        return String.join("", str.split("[aeiouAEIOU]"));
    }
}