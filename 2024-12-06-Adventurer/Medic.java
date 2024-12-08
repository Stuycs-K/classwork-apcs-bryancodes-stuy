public class Medic extends Adventurer{

  private int medicalKit, maxMeds;
  private String specialName;

  public Medic(String name, int supply, int code){
    super(name);
    medicalKit = supply;
    maxMeds = supply + 5;
    specialName = "Medic " + code;
  }

  public Medic(String name, int hp, int supply, int code){
    super(name, hp);
    medicalKit = supply;
    maxMeds = supply + 5;
    specialName = "Medic " + code;
  }

  public String getSpecialName(){
    return specialName;
  }

  public int getSpecial(){
    return medicalKit;
  }

  public void setSpecial(int n){
    medicalKit = n;
  }

  public int getSpecialMax(){
    return maxMeds;
  }

  public String attack(Adventurer other){
    super.other.applyDamage(super.other.getHP / 2); 
    setSpecial(n - 1); // The medical kits also contain poisons or make a person overdose.
  }

  public String support(Adventurer other){
    int newHP = super.other.getHP() * 2;
    if (newHP > super.other.getmaxHP()) newHP = super.other.getmaxHP();
    super.other.setHP(newHP);
    setSpecial(n - 1); // Use medicine on the other adventurer. 
  }

  public String support(){
    int newHP = super.getHP() * 2;
    if (newHP > super.getmaxHP()) newHP = super.getmaxHP();
    super.setHP(newHP);
    setSpecial(n - 1);
  }

  public String specialAttack(Adventurer other){
    int otherHealth = super.other.getHP();
    super.other.applyDamage(otherHealth); //kills opponent completely
    setSpecial(n - 3); // Uses three medical kits
    setSpecial(otherHealth * 3); // Each hp can get 3 medical kits
  }
}
