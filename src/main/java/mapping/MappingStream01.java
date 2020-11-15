package mapping;

import java.util.Arrays;
import java.util.List;

/**
 * 학생들 점수의 평균을 구하기
 * 
 * @author USER
 *
 */
public class MappingStream01 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("이승모", 30), new Student("팔로세비치", 50));
        Double avg = list.stream()
                         .mapToInt(Student::getScore)
                         .average()
                         .getAsDouble();
        System.out.println("평균 점수 : " + avg);
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