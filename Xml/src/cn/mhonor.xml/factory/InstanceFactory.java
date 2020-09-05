package cn.mhonor.xml.factory;

import cn.mhonor.xml.entity.User;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 1:10
 */
public class InstanceFactory {

    public User createUser(){
        return new User();
    }
}
