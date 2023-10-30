
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 30; i >=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i<= 18; i++) {
            System.out.print(i + " ");
            i = i+2;
        }
        System.out.println();
        for (int i = 10; i>= 0; i--) {
            System.out.print(i + " ");
            i--;
        }
    }
}