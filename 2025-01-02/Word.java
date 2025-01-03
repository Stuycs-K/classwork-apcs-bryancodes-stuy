public class Word{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    for (int i = 0; i < alphabet.length(); i++){
      if (remainingLetters == 0){
        System.out.println(result);
      }
  }
}
