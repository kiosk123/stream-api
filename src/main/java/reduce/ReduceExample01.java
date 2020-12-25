package reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample01 {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("이승모", 30), new Student("팔로세비치", 50));
        Integer total = list.stream()
                         .map(Student::getScore)
                         .reduce(0, (a, b) -> a + b);
        System.out.println("종합점수 점수 : " + total);
        
        
        
        /*
         *  람다식을 기준으로 만족하는 데이터를 찾을 때까지 비교해가며 찾는다
            stream이 빈경우 빈 문자열 반환. 스트림이 비어있지 않은 경우 
                           첫번째 파라미터를 첫번째 비교대상으로 적용
        */
        List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
        String str = ls.stream().reduce("", (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        }); 
        System.out.println(str); //Complex 출력 -> 가장 긴 문자열 반환


    }

}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}