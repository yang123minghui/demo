package com.example.demo.mapper;

import com.example.demo.pojo.Tab;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Timer;


@Mapper
public interface TabMapper {
    /*
    * success
    * */
    List<Tab> tabList();



}
