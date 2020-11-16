package grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample01 {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("이승모", 30, "남"), 
                                           new Student("안젤리나", 50, "여"),
                                           new Student("손흥민", 70, "남"),
                                           new Student("이나은", 30, "여"));
        
        //성별로 평균 점수를 구함
        Map<String, Double> maps = list.stream().collect(Collectors.groupingBy(Student::getGender,
                                                         Collectors.averagingDouble(Student::getScore)));
        
        System.out.println("남자 평균 점수: " + maps.get("남"));
        System.out.println("여자 평균 점수: " + maps.get("여"));
        
        System.out.println("=============================================================");
        
        list = Arrays.asList(new Student("이승모", 30, "남"), 
                             new Student("안젤리나", 50, "여"),
                             new Student("손흥민", 70, "남"),
                             new Student("이나은", 30, "여"));
        
        Map<String, String> maps2 = list.stream().collect(Collectors.groupingBy(Student::getGender, 
                                                          Collectors.mapping(Student::getName,
                                                          Collectors.joining(", "))));
        //성별 전체 목록
        System.out.println("남자 전체 목록: " + maps2.get("남"));
        System.out.println("여자 전체 목록: " + maps2.get("여"));

    }

}


class Student {
    private String name;
    private int score;
    private String gender;
    
    public Student(String name, int score, String gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}