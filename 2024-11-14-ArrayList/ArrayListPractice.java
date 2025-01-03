import java.util.ArrayList;

public class ArrayListPractice{

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String>answer = new ArrayList<String>(size);
    int currentInt;
    for (int i = 0; i < size; i++){
      currentInt = (int)(Math.random() * 10);
      if (currentInt == 0){
        answer.add("");
      }
      else
      answer.add("" + currentInt);
    }
    return answer;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

   public static ArrayList<String> makeReversedList( ArrayList<String> original){
  // //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String>reverse = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--){
      reverse.add(original.get(i));
    }
    return reverse;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String>combined = new ArrayList<String>(a.size() + b.size());
  if (a.size() > b.size()){
    for (int i = 0; i < b.size(); i++){
        combined.add(a.get(i));
        combined.add(b.get(i));
    }
    if (a.size() > b.size()){
        for (int i = b.size(); i < a.size(); i++){
            combined.add(a.get(i));
        }
    }
    return combined;
  }else{
    for (int i = 0; i < a.size(); i++){
        combined.add(a.get(i));
        combined.add(b.get(i));
    }
    for (int i = a.size(); i < b.size(); i++){
        combined.add(b.get(i));
    }
    return combined;
  }
  }
}

