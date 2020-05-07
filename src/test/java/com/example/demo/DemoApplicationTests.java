package com.example.demo;

import com.example.demo.mapper.TabMapper;
import com.example.demo.pojo.Tab;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

@SpringBootTest
class DemoApplicationTests {
    @Resource
	TabMapper tabMapper;
	@Test
	void contextLoads() {

        List<Tab> tabs = tabMapper.tabList();
        //tabs.forEach(tab-> System.out.println(tab));
        //Arrays.asList("a","b","c").forEach(a-> System.out.println(a));
        Arrays.asList("a","b","c").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        //Arrays.asList("a","b","c").sort((o1,o2)->o1.compareTo(o2));
        Timer timer = new Timer();
        tabs.forEach(emp->{
            if (emp.getId()<4){
                System.out.println(emp);
            }
        });



    }
    public void load(){

    }

}
