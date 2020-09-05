package cn.mhonor.mixed.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * //@Component @Controller @Service @Repository
 * @author Mr.mhonor
 * @date 2020/9/6 2:07
 */
@Component
public class Friend {

    @Value("${firendName}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
