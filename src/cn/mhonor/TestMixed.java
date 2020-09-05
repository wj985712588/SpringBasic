package cn.mhonor;

import cn.mhonor.mixed.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 2:06
 */
public class TestMixed {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config-annotation.xml");
        User user= (User) applicationContext.getBean("user");
        System.out.println(user.toString());
    }
}
