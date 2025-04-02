public class Patterns {
    public static void main(String [] args) {
        int n=6;

        for (int i = 0; i < n+1; i++) {
            if (n/2 <= i) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}