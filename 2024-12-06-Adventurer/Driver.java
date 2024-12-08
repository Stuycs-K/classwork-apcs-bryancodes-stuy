public class Driver{
    public static void main(String[] args){
        Adventurer a = new Medic("Carl", 20, 7, "Viper");
        System.out.println(a.getName() + " is " + a.getSpecialName() + " and has " + a.getSpecial() + " medkits.");
        a.setSpecial(15);
        System.out.println("New supply is " + a.getSpecial() + " medkits.");
        Adventurer b = new Medic("Ralph", 16, "Hawk");
        System.out.println(b.getSpecialName() + " can have " + b.getSpecialMax() + " medkits at most.");
        System.out.println(b.attack(a));
        System.out.println(b.support());
        System.out.println(b.support(a)); // You accidently help opponent.
        System.out.println(a.specialAttack(b));
        System.out.println(a.support(b));
    }
}