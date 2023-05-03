package inheritance_hero;

public class Fight {
    public static void main(String[] args) {
        Zilong zilong = new Zilong(100, 40, 30, 50);
        Kagura kagura = new Kagura(80, 5, 50, 50);

        System.out.println("Zilong HP: " + zilong.getHP());
        System.out.println("Kagura HP: " + kagura.getHP());

        kagura.takeDamage(zilong.getBasicAttack());
        System.out.println("Zilong menyerang Kagura memberikan " + zilong.getBasicAttack() + " damage. Kagura HP: " + kagura.getHP());
        
        zilong.takeDamage(kagura.getSkillDamage());
        System.out.println("Kagura menyerang Zilong memberikan " + zilong.getSkillDamage() + " damage. Zilong HP: " + kagura.getHP());

        zilong.ultimateSkill();
        kagura.takeDamage(15);
        System.out.println("Zilong menggunakan ultimate skill dan memberi damage 15. Kagura HP: " + kagura.getHP());

        kagura.skillUse();
        zilong.takeDamage(25);
        System.out.println("Kagura menggunakan ultimate skill dan memberikan damage 25. Zilong HP: " + zilong.getHP());
    }
}
