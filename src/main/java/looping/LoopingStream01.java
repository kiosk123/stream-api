package looping;

import java.util.Arrays;
import java.util.List;

public class LoopingStream01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("이승모", "일류첸코", "팔로세비치");
        
        // 리스트에 있는 데이터를 순차로 출력
        list.forEach(System.out::println);

    }

}
