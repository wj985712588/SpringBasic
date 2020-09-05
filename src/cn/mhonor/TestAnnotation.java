package cn.mhonor;

import cn.mhonor.annotation.config.MyConfiguartion;
import cn.mhonor.annotation.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 3:39
 */
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguartion.class);
        User user=applicationContext.getBean(User.class);
        System.out.println(user.toString());
    }
}
