package day17;

public class DemoMain {
    public static void main(String[] args) {
        Hearo hearo=new Hearo();

        hearo.setName("盖伦");
        hearo.setAge(20);

        Weapon weapon=new Weapon("多兰剑");

        hearo.setWeapon(weapon);

        SkillImpl skill=new SkillImpl();

        hearo.setSkill(skill);


        hearo.attack();
    }
}
