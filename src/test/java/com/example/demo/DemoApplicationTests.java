package com.example.demo;

import com.example.demo.mapper.TabMapper;
import com.example.demo.pojo.GreetingService;
import com.example.demo.pojo.Tab;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

@SpringBootTest
class DemoApplicationTests {
    @Resource
	TabMapper tabMapper;
	@Test
	void contextLoads() {

        List<Tab> tabs = tabMapper.tabList();
        //tabs.forEach(tab-> System.out.println(tab));
        //Arrays.asList("a","b","c").forEach(a-> System.out.println(a));
        Arrays.asList("a", "b", "c").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        //Arrays.asList("a","b","c").sort((o1,o2)->o1.compareTo(o2));
        tabs.forEach(emp -> {
            if (emp.getId() < 4) {
                System.out.println(emp);
            }
        });

        try {
            System.out.println("try");

        } catch (Exception e) {
            System.out.println("e");
        } finally {
            System.out.println("finaly");
        }
        final int num = 1;
        /*
        param取决于conver(int i)的参数
         */
        Converter<Integer, String> s = (param) -> {
            int k = param + num;
            System.out.println(k);
        };
        s.convert(2);
        GreetingService service=message -> {
            System.out.println(message);
        };
        Predicate<Integer> predicate=f ->false;
        System.out.println(predicate.test(10));

        BiConsumer<String,Integer> biConsumer=(i,msg)->{
            System.out.println(i+""+msg);
        };
        biConsumer.accept("uer1",10);
                                        /* 方法的参数->方法体（或者返回值）*/
        eval(Arrays.asList(20,30,10,1),integer ->integer>10);

    }
    /*
    接口只能有一个方法
     */
   public interface Converter<T1,T2>{
	    void  convert(int i);

   }
   /*Predicate.test(n)是个返回一个boolean*/
   public  static void eval(List<Integer>list,Predicate<Integer> predicate){
       list.forEach(n -> {
           if (predicate.test(n)) {
               System.out.println(n+",");
           }
       });
   }

}
