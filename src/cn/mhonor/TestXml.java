package cn.mhonor;

import cn.mhonor.xml.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 2:35
 */
public class TestXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config-xml.xml");
        User user= (User) applicationContext.getBean("user");
        System.out.println(user.toString());
    }
}
