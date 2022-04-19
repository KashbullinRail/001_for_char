/**
 * @author Раиль
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        for (char i = 32; i < 128; i++) {
            System.out.print("  " + i);
        }
        System.out.println("");
        System.out.println("Все char");

        System.out.println("");
        System.out.println("");
        for (char i = 32; i < 128; i++) {
            System.out.print("  " + i);
            i++;
        }
        System.out.println("");
        System.out.println("Все char через раз");
    }
}