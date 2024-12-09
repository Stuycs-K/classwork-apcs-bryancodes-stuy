import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    Adventurer player = new CodeWarrior(userName);
    Adventurer enemy = new Medic("Bryan", 8, "bot");
    System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecial());
    System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecial());
    while (player.getHP() > 0 && enemy.getHP()){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();
      try{
        if (move.equals("a") || move.equals("attack")){
          System.out.println(player.attack(enemy));
          int choose = (int)(Math.random() * 10);
          if (choose > 5){
            System.out.println(enemy.support());
          }else{
            System.out.println(enemy.attack(player));
          }
        }
        if (move.equals("sp") || move.equals("special")){ 
          System.out.println(player.specialAttack(enemy));
          int choose = (int)(Math.random() * 10);
          if (choose > 5){
            System.out.println(enemy.support());
          }else{
            System.out.println(enemy.attack(player));
          }
        }
        if (move.equals("su") || move.equals("support")){
          System.out.println(player.support());
          int choose = (int)(Math.random() * 10);
          if (choose > 5){
            System.out.println(enemy.support());
          }else{
            System.out.println(enemy.attack(player));
          }
        }
        if (move.equals("quit")) {
          System.out.println("The game is over.");
          System.exit(0);
        }
      }
    }
  }
}
