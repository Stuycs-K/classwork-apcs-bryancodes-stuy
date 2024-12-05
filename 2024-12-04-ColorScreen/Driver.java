public class Driver{

    public static final int[] randomInt = new int[]{17, 55, 89};

    public static void border(int wide, int height, int colorChoice){
        int w = 0;
        int h = 0;
        while (w < wide){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            w++;
        }
        while (h < height){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            h++;
        }
        while (w >= 0){
            Text.go(h, w);
            Text.color(colorChoice);
            System.out.print("Q");
            w--;
        }
        while (h >= 0){
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
        border(30, 80, Text.MAGENTA);
        Text.go(29, 0);
        Text.go(29, 26);
        colorKey(randomInt[0]);
        Text.go(29, 52);
        colorKey(randomInt[1]);
        Text.go(29, 78);
        colorkey(randomInt[2]);
    }
}