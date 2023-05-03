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
