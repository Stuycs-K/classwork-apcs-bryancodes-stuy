import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2{
    public static int bathroom(String filename){
        try{    
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int[][] pad = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int r = 1;
            int c = 1;
            while (input.hasNextLine()){
                for (int i = 0; i < )
            }
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }
}