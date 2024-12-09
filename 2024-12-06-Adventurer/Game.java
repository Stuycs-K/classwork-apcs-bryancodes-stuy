import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    CodeWarrior player = new CodeWarrior(userName);
    Medic enemy = new Medic("Bryan", 8, "bot");
    System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecial());
    System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecial());
  }
}
