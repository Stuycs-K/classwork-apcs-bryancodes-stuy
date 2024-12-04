public class ColorDemo{
  public static void color(int red, green, blue){
    System.out.print("\u001b[38; 2" + red + ";" + green + ";" +  blue + "m");
  }
  public static void main(String[] args){ //Intentionally mixed up the rgb order
    for (int b = 0; b <= 256; b++){
      for (int g = 256; g > 0; g--){
        for (int r = 0; g <= 256; r += 2){
          color(r, g, b);
        }
      }
      System.out.println();
    }
    System.out.print("\u001b[0m");
  }
}
