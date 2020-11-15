package create_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 다양하게 스트림을 얻는 방법
 * @author USER
 *
 */
public class CreateStream01 {

    public static void main(String[] args) throws Exception {
        /**
         * 컬렉션으로 부터 스트림 얻기
         */
        List<Student> list = Arrays.asList(new Student("이승모", 30), new Student("팔로세비치", 50));
        Double avg = list.stream()
                         .mapToInt(Student::getScore)
                         .average()
                         .getAsDouble();
        System.out.println("평균 점수 : " + avg);
        
        /**
         * 배열로 부터 스트림 얻기
         */
        Arrays.stream(new String[] {"이승모", "일류첸코", "팔로세비치"})
              .forEach(System.out::println);
        
        /**
         * 숫자 범위로 스트림 생성
         */
        IntStream.rangeClosed(0, 1000)
                 .forEach(System.out::println);
        
        /**
         * 파일로 스트림 얻기
         */
        Path filePath = Paths.get("test/test.txt");
        Files.lines(filePath, Charset.defaultCharset())
             .forEach(System.out::println);
        
        BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()));
        br.lines()
          .forEach(System.out::println);
        br.close();
        
        /**
         * 디렉터리로 부터 스트림 얻기
         */
        Path dirPath = Paths.get("test");
        Files.list(dirPath).forEach(path -> System.out.println(path.getFileName()));
        
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
