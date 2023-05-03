## Inheritance

### Class Karakter
```java
package inheritance_hero;

public class Karakter {
    private int HP;
    private int basicAttack;
    private int skillDamage;

    public Karakter(int HP, int basicAttack, int skillDamage){
        this.HP = HP;
        this.basicAttack = basicAttack;
        this.skillDamage = skillDamage;
    }

    public int getHP(){
        return HP;
    }

    public int getBasicAttack(){
        return basicAttack;
    }

    public int getSkillDamage(){
        return skillDamage;
    }

    public void takeDamage(int damage){
        HP -= damage;
        if (HP < 0){
            HP = 0;
        }
    }
}
```

### Class Zilong
```java
package inheritance_hero;

public class Zilong extends Karakter {
    private int physicalDamage;

    public Zilong (int HP, int basicAttack, int skillDamage, int physicalDamage){
        super(HP, basicAttack, skillDamage);
        this.physicalDamage = physicalDamage;
    }

    public int getMovementSpeed(){
        return physicalDamage;
    }

    public void ultimateSkill(){
        System.out.println("Biarkan pedangku menusuk hingga jantungmu!");
    }

}
```
### Class Kagura
```java
package inheritance_hero;

public class Kagura extends Karakter {
    private int magicDamage;

    public Kagura (int HP, int basicAttack, int skillDamage, int magicDamage){
        super(HP, basicAttack, skillDamage);
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage(){
        return magicDamage;
    }

    public void skillUse(){
        System.out.println("Payungku akan menghancurkanmu!");
    }
}
```
### Class Fight
```java
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
```


