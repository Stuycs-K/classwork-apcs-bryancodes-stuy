import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle(int a, int b, int c) {
    if (a + b <= c) return false;
    if (a + c <= b) return false;
    if (b + c <= a) return false;
    return true;
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int[] sides = new int[3];
      while(input.hasNext()){
        for (int i = 0; i < 3; i++) {
          String intString = input.next();
          sides[i] = Integer.parseInt(intString);
        }
        if (isTriangle(sides[0], sides[1], sides[2])) {
          count++;
        }
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}