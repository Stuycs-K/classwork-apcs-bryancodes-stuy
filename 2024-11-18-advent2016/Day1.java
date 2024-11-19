import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day1{
    public static int blocks(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int x = 0;
            int y = 0;
            int face = 0;
            ArrayList<String> instruct = new ArrayList<String>();
            int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            while (input.hasNext()){
                instruct.add(input.next());
            }
            for (int i = 0; i < instruct.size(); i++){
                if (instruct.get(i).substring(0, 1).equals("R")){
                    face++;
                    if (face > 3) face = 1;
                    x += dir[face][0] * Integer.valueOf(instruct.get(i).substring(1, (instruct.get(i).length()) - 1));
                    y += dir[face][1] * Integer.valueOf(instruct.get(i).substring(1, (instruct.get(i).length()) - 1));
                }if (instruct.get(i).substring(0, 1).equals("L")){
                    face--;
                    if (face < 0) face = 3;
                    x += dir[face][0] * Integer.valueOf(instruct.get(i).substring(1, (instruct.get(i).length()) - 1));
                    y += dir[face][1] * Integer.valueOf(instruct.get(i).substring(1, (instruct.get(i).length()) - 1));
                }
            }
            input.close();
            return Math.abs(x) + Math.abs(y);
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(blocks("input.txt"));
    }
}