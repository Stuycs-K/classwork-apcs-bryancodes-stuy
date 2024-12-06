public class Medic extends Adventurer{

  private int medicalKit;

  public Medic(String name, int supply){
    super(name);
    medicalKit = supply;
  }

  public Medic(String name, int hp){
    super(name, hp);
    medicalKit = supply;
  }
}
