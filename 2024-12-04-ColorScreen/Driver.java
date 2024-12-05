public class Driver{

    public static final int[] randomInt = new int[]{17, 55, 89};

    public static void border(int wide, int height, int colorChoice){
        int w = 1;
        int h = 1;
        while (w <= wide){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            w++;
        }
        while (h <= height){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            h++;
        }
        while (w >= 1){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            w--;
        }
        while (h >= 1){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            h--;
        }
    }

    public static void colorKey(int num){
        if (num < 25){
            Text.color(Text.RED, Text.BRIGHT);
            System.out.print(num);
        }else{
            if (num > 75){
                Text.color(Text.GREEN, Text.BRIGHT);
                System.out.print(num);
            }else{
                Text.color(Text.WHITE);
                System.out.print(num);
            }
        }
    }


    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        border(80, 31, Text.MAGENTA);
        Text.go(2, 1);
        Text.go(2, 26);
        colorKey(randomInt[0]);
        Text.go(2, 52);
        colorKey(randomInt[1]);
        Text.go(2, 78);
        colorKey(randomInt[2]);
        Text.go(3, 1);
        Text.color(Text.CYAN);
        for (int i = 2; i < 80; i++){
            Text.go(3, i);
            System.out.print("E");
        }
        Text.go(31, 0);
        System.out.println(Text.RESET);
    }
}