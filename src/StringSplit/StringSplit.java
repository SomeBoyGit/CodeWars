package StringSplit;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "LovePizza";
        String s2 = "abcdef";
        String s3 = "HelloWorldd";
        System.out.println("s = " + s);
        System.out.println(Arrays.toString(solution(s)));
        System.out.println("s1 = " + s1);
        System.out.println(Arrays.toString(solution(s1)));
        System.out.println("s2 = " + s2);
        System.out.println(Arrays.toString(solution(s1)));
        System.out.println("s3 = " + s3);
        System.out.println(Arrays.toString(solution(s1)));
    }

    public static String[] solution(String s) {
        char[] chars = s.toCharArray();
        String[] array = new String[chars.length % 2 == 0 ? chars.length / 2 : (chars.length + 1) / 2];
        if (chars.length % 2 == 0) {
            for (int i = s.length() - 1, j = array.length - 1; i > 0; i -= 2, j--) {
                array[j] = String.valueOf(chars[i - 1]) + chars[i];
            }
        } else {
            for (int i = s.length() - 1, j = array.length - 1; i > 0; i -= 2, j--) {
                if (i == s.length() - 1) {
                    array[j] = String.valueOf(chars[i]) + '_';
                    i++;
                } else {
                    array[j] = String.valueOf(chars[i - 1]) + chars[i];
                }
            }
        }
        return array;
    }
}