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
