package cn.mhonor.annotation.entity;

import cn.mhonor.annotation.config.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 3:26
 */
@Component
public class Friend {

    @Autowired
    PropertiesConfiguration propertiesConfiguration;

    private String name;

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + propertiesConfiguration.getFriendName() + '\'' +
                '}';
    }
}
