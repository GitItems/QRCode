package com.study.springbootlevel1.start;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: spring-boot-level1
 * @Package: com.study.spri   ngbootlevel1.start
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2019/8/30 14:18
 */
public class Test {
    public static void main(String[] args) throws Exception {

        System.out.println(86400000L/(24*60*60*1000));

        SimpleDateFormat formatHHmmss = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat formatyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String[] period1 = new String[]{"07:00:00","20:00:00"};
        String[] period2 = new String[]{"10:00:00","20:00:00"};
        String[] period3 = new String[]{"20:00:00","23:00:00"};
//        10801000
//        7201000
//        9001000
//        -7200000
//        -9000000
//        -10800000
//        -3600000
        System.out.println("开始:"+dateFormat.format(new Date(1567659600000L)));
        System.out.println("结束:"+dateFormat.format(new Date(1567666800000L)));

       String str =  formatyyMMdd.format(
                formatyyMMdd.parse("2019-9-3").getTime() + (6*(24*60*60*1000))
                            );
//        System.out.println(str);
        double hour = 60*60*1000;
        double maxUnit = Double.valueOf(1800000) / hour;
//        System.out.println(maxUnit);

//java.math.BigDecimal
        BigDecimal bd = new BigDecimal(3*2.4);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);

        // period1[0]-period1[1]  period1[0]-period2[0]
        // 判断第一个时段开始时间到第二个时段开始时间
    }

    public static double convertToMinute(Long time)throws Exception{
        return time % (60*1000) == 0 ? time/(60*1000) : time/(60*1000)+1;
    }
}
