package challenge;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class second  {
    enum Gender {남, 여}
    public static void main(String[] args) {
        Stream<String> stream;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        Stream<Integer> sum = ages.stream();
        System.out.println(sum.reduce(0, (a, b) -> a + b));
        sum = ages.stream();
        System.out.println(sum.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}
