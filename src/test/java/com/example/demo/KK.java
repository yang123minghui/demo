package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author `root123456`
 * @date:2020/5/8 000810:09
 */
@SpringBootTest
public class KK {
    @Test
    void load(){
        List<String>strings= Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> filtered=strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        Random random=new Random();
        /*创建ints流 。限制。遍历*/
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
                /*map ,每个元素映射到》自己想要的结果（integer*integer）。筛选不同（可选参数）。转化成List*/
        List<Integer>sq=numbers.stream().map(integer -> integer*integer).distinct().collect(Collectors.toList());
        System.out.println(sq);

        random.ints().limit(10).sorted().forEach(System.out::println);
       numbers.stream().filter(integer -> integer > 5).collect(Collectors.toList()).forEach(integer -> System.out.println(integer));

        long count = strings.parallelStream().filter(s -> s.isEmpty()).count();

        System.out.println("长度："+count);
        IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("最大数"+summaryStatistics.getMax());
        System.out.println("最小数"+summaryStatistics.getMin());
        System.out.println("和"+summaryStatistics.getSum());
        System.out.println("平均数"+summaryStatistics.getAverage());
        System.out.println("个数"+summaryStatistics.getCount());
    }
}

