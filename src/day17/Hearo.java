package day17;

public class Hearo {
    private String name;
    private Weapon weapon;  //武器
    private int age;
    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hearo() {
    }

    public Hearo(String name, Weapon weapon, int age,Skill skill) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
        this.skill=skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"使用"+weapon.getCode());
        skill.used();
    }
}
