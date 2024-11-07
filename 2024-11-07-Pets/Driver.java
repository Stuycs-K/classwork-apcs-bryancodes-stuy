// The speak() method for Bird printed "My name is The Mighty Duck"
// instead of "My name is Duck"
// And the speak() method for Animal printed the same thing
// b2 does not work because it's a Bird type and is assigned as an Animal 
// from the super class, which is not possible, as Animal does not have all
// the necessary functions for bird, since it doesn't have height or color.
public class Driver{
  public static void main(String[] args){
    Animal myAnimal = new Animal("Quack", 10, "Duck");
    System.out.println("Expected:");
    System.out.println("My name is Duck.\nI am 10 years old.\nI say Quack.");
    System.out.println("Returned:");
    myAnimal.speak();
    myAnimal = new Bird("Quack", 10, "Duck", 5.2, "Green");
    System.out.println("Expected:");
    System.out.println("My name is Duck.\nI am 10 years old.\nI say Quack.\nMy feathers are colored Green\nI am 5.2 inches tall");
    System.out.println("Returned:");
    myAnimal.speak();
    Animal a1 = new Animal("Moo", 46, "Cow");
    Bird b1 = new Bird("Ahh", 7, "Eagle", 18.0, "Brown");
    // Bird b2 = new Animal("Bark", 16, "Dog");
    Animal a2 = new Bird("Chirp", 7, "Robin", 3.0, "Red");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
