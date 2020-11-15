package parallel;

import java.util.Arrays;
import java.util.List;

/**
 * 순차 스트림과 병렬 스트림에 사용된 스레드 이름을 콘솔에 출력
 *
 */
public class ParallelStream01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        
        //순차 스트림
        list.stream().forEach(s -> System.out.println(s + ":" + Thread.currentThread().getName()));
        
        //병령 스트림
        list.parallelStream().forEach(s -> System.out.println(s + ":" + Thread.currentThread().getName()));
    }
}
