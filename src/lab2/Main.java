package lab2;

public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(255, 0,0);
        System.out.println(color1);

        Color color2 = new Color(0,0,255);
        System.out.println(color2);

        Color color3 = new Color(0,255,0);
        System.out.println(color3);

        ColorRGBA colorRGBA = new ColorRGBA(255,255,255, 120);
        System.out.println(colorRGBA);
    }

}
