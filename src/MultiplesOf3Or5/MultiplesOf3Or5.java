package MultiplesOf3Or5;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution2(10));
    }

    public static int solution(int number) {
        if (number < 0) return 0;
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static int solution2(int number) {
        if (number < 0) return 0;
        return IntStream.range(0, number)
                .filter(x -> x % 3 == 0 | x % 5 == 0)
                .sum();
    }
}

