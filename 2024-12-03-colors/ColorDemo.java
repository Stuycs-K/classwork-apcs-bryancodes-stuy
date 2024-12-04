public class ColorDemo{
  public static void color(int red, green, blue){
    System.out.print("\u001b[38; 2" + red + ";" + green + ";" +  blue + "m");
  }
  public static void main(String[] args){

  }
}
