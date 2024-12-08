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
    String result = "";
    if (super.other.getHP() > 0 && getSpecial() > 0){
      super.other.applyDamage(super.other.getHP() / 2); 
      setSpecial(getSpecial() - 1); // The medical kits also contain poisons or make a person overdose.
      result = "Opponent health is now: " + super.other.getHP() + " and you have " + getSpecial() + " medical kits.";
      return result;
    }else{
      result = "Opponent is already dead or not enough medical kits.";
      return result;
    }
  }

  public String support(Adventurer other){
    String result = "";
    if (super.other.getHP() > 0 && getSpecial() > 0){
      int newHP = super.other.getHP() * 2;
      if (newHP > super.other.getmaxHP()) newHP = super.other.getmaxHP();
      super.other.setHP(newHP);
      setSpecial(getSpecial() - 1); // Use medicine on the other adventurer.
      result = "Opponent health is now: " + super.other.getHP() + " and you have " + getSpecial() + " medical kits.";
      return result; 
    }else{
      result = "Opponent is already dead or not enough medical kits.";
      return result;
    }
  }

  public String support(){
    String result = "";
    if (super.getHP() > 0 && getSpecial() > 0){
      int newHP = super.getHP() * 2;
      if (newHP > super.getmaxHP()) newHP = super.getmaxHP();
      super.setHP(newHP);
      setSpecial(getSpecial() - 1);
      result = "Your health is now: " + super.other.getHP() + " and you have " + getSpecial() + " medical kits.";
      return result;
    }else{
      result = "Your or your supplies are dead.";
      return result;
    }
  } 

  public String specialAttack(Adventurer other){
    String result = "";
    if (super.getHP() > 0 && getSpecial() > 3){
      int otherHealth = super.other.getHP();
      super.other.applyDamage(otherHealth); //kills opponent completely
      setSpecial(n - 3); // Uses three medical kits
      super.restoreSpecial(otherHealth * 3); // Each hp can get 3 medical kits
      result = "Opponent health is now: " + super.other.getHP() + " and you have " + getSpecial() + " medical kits.";
      return result; 
    }else{
      result = "Opponent is already dead or not enough medical kits.";
      return result;
    }
  }
}
