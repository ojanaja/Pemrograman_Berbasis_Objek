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
