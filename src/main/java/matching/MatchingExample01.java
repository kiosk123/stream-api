package matching;

import java.util.Arrays;

public class MatchingExample01 {
    public static void main(String[] args) {
        int[] intArr = { 2, 4, 6};
        boolean result = Arrays.stream(intArr)
                               .allMatch(n -> n % 2 == 0);
        System.out.println("모든 값은 2의 배수인가 : " + result);
        
        result = Arrays.stream(intArr)
                       .anyMatch(n -> n % 2 == 0);
        System.out.println("2의 배수를 만족하는 숫자가 하나라도 있는가 : " + result);
        
        result = Arrays.stream(intArr)
                       .noneMatch(n -> n % 2 == 0);
        System.out.println("2의 배수를 만족하는 숫자는 아무 것도 없는가? : " + result);
    }
}
