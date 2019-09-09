package com.study.springbootlevel1.start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @ProjectName: spring-boot-level1
 * @Package: com.study.springbootlevel1.start
 * @ClassName: StartTest
 * @Author: MrChen
 * @Date: 2019/8/30 10:17
 */
@RestController
public class StartTest {

    public StartTest(){
        System.out.println("我被扫描了!!");
    }

    @RequestMapping("/hello")
    public String hello(){

//        String startStr = "2019-08-26 16:34:15";
//        String endStr = "2019-08-27 09:39:48";

        long startDate = 1565332524L,endDate = 1565337124L; //秒

        SimpleDateFormat formatHHmmss = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat formatyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        double price = 10.0;
        int CYCLE = 30; //分钟



        String startStrTime = "",endStrTime = ""; //工作日收费时段


        return "Spring boot Hello!";
    }
}
