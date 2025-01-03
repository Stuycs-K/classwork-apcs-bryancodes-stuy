public class Word{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    for (int i = 0; i < alphabet.length(); i++){
      if (remainingLetters == 0){
        System.out.println(result);
      }else{
        if (i == alphabet.length() - 1){
          result += alphabet.substring(i);
        }else{
          result += alphabet.substring(i, i + 1);
        }
      }
  }
}
