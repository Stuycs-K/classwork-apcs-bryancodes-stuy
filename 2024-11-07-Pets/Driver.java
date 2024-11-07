public class Driver{
  public static void main(String[] args){
    Animal myAnimal = new Animal("Quack", 10, "Duck");
    System.out.println("Expected:");
    System.out.println("My name is Duck.\nI am 10 years old.\nI say Quack.");
    System.out.println("Returned:");
    myAnimal.speak();
  }
}
