package collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample01 {
    public static void main(String[] args) {
            List<Student> list = Arrays.asList(new Student("이승모", 30), 
                                               new Student("팔로세비치", 50),
                                               new Student("팔라시오스", 60),
                                               new Student("일류첸코", 20),
                                               new Student("데얀", 70));
            //50점 이상의 선수만 수집
            list.stream()
                .filter(s -> s.getScore() >= 50)
                .collect(Collectors.toList())
                .forEach(System.out::println);;
            
            
            //50점 미망늬 선수만 묶어서 HashSet 생성
            list.stream()
                .filter(s -> s.getScore() < 50)
                .collect(Collectors.toCollection(HashSet::new))
                .forEach(System.out::println);
            
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

        @Override
        public String toString() {
            return "Student [name=" + name + ", score=" + score + "]";
        }
    }