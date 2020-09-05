package cn.mhonor.annotation.entity;

/**
 * @author Mr.mhonor
 * @date 2020/9/6 3:20
 */
public class User {

    private String name;

    private int age;

    private Friend firend;

    private Enemy enemy;

    public User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Friend getFirend() {
        return firend;
    }

    public void setFirend(Friend firend) {
        this.firend = firend;
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
                ", firend=" + firend +
                ", enemy=" + enemy +
                '}';
    }
}
