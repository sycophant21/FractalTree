import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = /*100;*/scanner.nextInt();
        Panel panel = new Panel(height);
        Frame frame = new Frame(panel);
    }
}
