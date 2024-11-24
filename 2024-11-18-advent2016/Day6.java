import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day6{
    public static String signal(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String message = "";
            int line = 0;
            while (input.hasNextLine()){
                line++;
            }
            String[][] comms = new String[line][];
            int i = 0;
            String each = "";
            while (input.hasNextLine()){
                each = input.nextLine();
                coms[i][] = input.split("");
                i++;
            }
            String[][] rearrange = new String[coms[i][0].length][line];
            for (int j = 0; j < rearrange.length; j++){
                for (int k = 0; k < rearrange[j].length; k++){
                    rearrange[j][k] = comms[k][j];
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            return "";
        }
    }

    public static void main(String[] args){
        System.out.println(signal("input.txt"));
    }
}