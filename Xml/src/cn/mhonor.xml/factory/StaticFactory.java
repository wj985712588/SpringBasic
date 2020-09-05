package cn.mhonor.xml.factory;

import cn.mhonor.xml.entity.User;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 1:11
 */
public class StaticFactory {

    public static User createUser(){
        return new User();
    }
}
