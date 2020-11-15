package mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java8 lamda", "stream mapping");
        
        /*
         * java8 
         * lamda 
         * stream 
         * mapping
         */

        list.stream()
            .flatMap(str -> Arrays.stream(str.split(" ")))
            .forEach(w -> System.out.println(w));
        
        System.out.println("====================");
        
        list =  Arrays.asList("10, 20, 30", "40, 50, 60");
        list.stream()
            .flatMapToInt(str -> {
                String[] strArr = str.split(",");
                int[] intArr = new int[strArr.length];
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i].trim());
                }
                return Arrays.stream(intArr);
            })
            .forEach(System.out::println);
        
        System.out.println("====================");
        
        int[] intArr = { 1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.asDoubleStream() //int -> long
                 .forEach(System.out::println);
        
        intStream = Arrays.stream(intArr);
        intStream.boxed() //오토 박싱
                 .forEach(data -> System.out.println(data.intValue()));

    }

}
