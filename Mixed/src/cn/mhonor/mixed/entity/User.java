package cn.mhonor.mixed.entity;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 1:08
 */
public class User {

    private String name;

    private int age;

    private Friend friend;

    private Enemy enemy;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                ", enemy=" + enemy +
                '}';
    }
}
