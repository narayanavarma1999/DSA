public class Recrusion {
    public static void main(String[] args) {
        int n = 1;
        recrusion(n);
    }

    private static void recrusion(int n) {
        if (n == 10) {
            return;
        }

        System.out.println(n);
        n += 1;
        recrusion(n);
    }
}
