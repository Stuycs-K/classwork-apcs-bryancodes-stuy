public class Driver{

    public static final int[] randomInt = new int[]{17, 55, 89};

    public static void border(int wide, int height, int colorChoice){
        int w = 0;
        int h = 0;
        while (w < wide){
            Text.go(h, w);
            Text.color(Text.background(colorChoice));
            w++;
        }
        while (h < height){
            Text.go(h, w);
            Text.color(Text.background(colorChoice));
            h++;
        }
        while (w >= 0){
            Text.go(h, w);
            Text.color(Text.background(colorChoice));
            w--;
        }
        while (h >= 0){
            Text.go(h, w);
            Text.color(Text.background(colorChoice));
            h--;
        }
    }
}