package lab2;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu Color
        Color color1 = new Color(255, 100, 50);
        System.out.println("Obiekt Color (metoda toString()): " + color1);

        // Wypisanie poszczególnych składowych obiektu Color
        System.out.println("Red: " + color1.Red());
        System.out.println("Green: " + color1.Green());
        System.out.println("Blue: " + color1.Blue());

        // Tworzenie obiektu ColorRGBA z podaną wartością alpha
        ColorRGBA color2 = new ColorRGBA(50, 150, 200, 128);
        System.out.println("\nObiekt ColorRGBA (metoda toString()): " + color2);

        // Wypisanie poszczególnych składowych obiektu ColorRGBA
        System.out.println("Red: " + color2.red());
        System.out.println("Green: " + color2.green());
        System.out.println("Blue: " + color2.blue());
        System.out.println("Alpha: " + color2.alpha());

        // Tworzenie obiektu ColorRGBA z domyślną wartością alpha
        ColorRGBA color3 = new ColorRGBA(0, 255, 0);
        System.out.println("\nObiekt ColorRGBA z domyślnym alpha: " + color3);

        // Wypisanie poszczególnych składowych obiektu ColorRGBA z domyślnym alpha
        System.out.println("Red: " + color3.red());
        System.out.println("Green: " + color3.green());
        System.out.println("Blue: " + color3.blue());
        System.out.println("Alpha: " + color3.alpha());
    }
}
