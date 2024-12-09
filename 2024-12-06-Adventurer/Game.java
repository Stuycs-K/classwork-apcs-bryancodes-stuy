import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    CodeWarrior player = new CodeWarrior(userName);
    Medic enemy = new Medic("Bryan", 8, "bot");
  }
}
