package sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample01 {

    public static void main(String[] args) {
        int[] intArr = { 4, 2, 1, 3, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.sorted() //정렬
                 .forEach(System.out::println);
        
        System.out.println("=============================");
        
        List<Student> list = Arrays.asList(new Student("이승모", 30), new Student("팔로세비치", 50));
        list.stream()
            .sorted((a, b) -> {
               return a.getScore() - b.getScore(); 
            })
            .forEach(o -> System.out.println(o.getName() + ":" + o.getScore()));;
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