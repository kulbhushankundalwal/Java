import java.util.Scanner;

public class Str2_ShortestPath {

    public static float ShortPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        System.out.print("Enter Path: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Shortest path is: " + ShortPath(str));
    }
}
