package cn.mhonor.annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 3:23
 */
@Configuration
@PropertySource("classpath:config.properties")
public class PropertiesConfiguration {

    private String friendName;

    private String enemyName;

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
}
