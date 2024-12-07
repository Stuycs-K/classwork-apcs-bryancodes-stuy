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
}
