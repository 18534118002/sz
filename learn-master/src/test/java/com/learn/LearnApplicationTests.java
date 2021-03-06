package com.learn;

import com.learn.utils.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
public class LearnApplicationTests {

    @Test
    public void contextLoads() {
        try {
            System.out.println(MD5Utils.getMD5Str("123456"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
