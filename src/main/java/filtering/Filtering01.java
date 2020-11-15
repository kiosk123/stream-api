package filtering;

import java.util.Arrays;
import java.util.List;

public class Filtering01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("이승모", "일류첸코", "팔로세비치", "이승모", "일류첸코");
        list.stream()
            .distinct() //중복제거
            .peek(s -> System.out.println("중복 제거 후 출력 : " + s))
            .filter(s -> s.length() > 3)  //문자열 길이가 3보다 큰 데이터만 다음 스트림으로 내보냄
            .forEach(s -> System.out.println("최종 출력 : " + s));

    }

}
