package cn.mhonor.annotation.config;

import cn.mhonor.annotation.entity.Enemy;
import cn.mhonor.annotation.entity.Friend;
import cn.mhonor.annotation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 3:19
 */
@Configuration
@ComponentScan(basePackages = "cn.mhonor.annotation.entity")
@Import({PropertiesConfiguration.class})
public class MyConfiguartion {

    public MyConfiguartion() {
        System.out.println("容器初始化中...");
    }

    @Autowired
    Friend friend;

    @Resource
    Enemy enemy;

    @Bean
    public User createUser(){
        User user=new User();
        user.setName("Mr.mhonor");
        user.setAge(26);
        System.out.println(friend.toString());
        System.out.println(enemy.toString());
        return user;
    }
}

