public class MyArrays{
  public static String arrayToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length - 1; i++)
    {
      result += nums[i] + ", ";
    }
    result += nums[nums.length - 1] + "]";
    return result;
  }
  public static int[] returnCopy(int[] ary){
    int[] newArray = new int[ary.length];
    for (int i = 0; i < ary.length; i++)
    {
      newArray[i] = ary[i];
    }
    return newArray;
  }
  public static void main(String[] args){
    int[] testArray = new int[] {5, 6, 9, 0, 2};
    System.out.println(arrayToString(testArray));
    System.out.println("Expected " + arrayToString(testArray) + " and got " + arrayToString(returnCopy(testArray)));
  }
}
