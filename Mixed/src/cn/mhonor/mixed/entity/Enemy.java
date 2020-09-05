package cn.mhonor.mixed.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 2:23
 */
@Component
public class Enemy {

    @Value("${enemyName}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enemy() {
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                '}';
    }
}
