public class Medic extends Adventurer{

  private int medicalKit;
  private String specialName;

  public Medic(String name, int supply, int code){
    super(name);
    medicalKit = supply;
    specialName = "Medic " + code;
  }

  public Medic(String name, int hp, int supply, int code){
    super(name, hp);
    medicalKit = supply;
    specialName = "Medic " + code;
  }

  public String getSpecialName(){
    return specialName;
  }

  public int getSpecial(){
    return medicalKit;
  }
}
