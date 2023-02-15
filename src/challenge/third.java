package challenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


enum Gender {남, 여}

public class third {

    static int i = 0;
    public static void main(String[] args) {
        Stream<String> stream;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        stream = names.stream();
        Stream<Member> memberStream = stream.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        System.out.println("\n[Member 스트림 원소]");
        memberStream.forEach(m -> System.out.print(m + " "));
        System.out.println();

        i = 0;
        stream = names.stream();
        memberStream = stream.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        Map<Gender, List<Member>> listMap = memberStream.collect(Collectors.groupingBy(Member::getGender));
        System.out.println("\n[Member 스트림을 성별로 그룹핑]");
        System.out.println(listMap);
    }
}