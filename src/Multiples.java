public class Multiples {
    public static void main(String[] args) {

        int i = 0;
        int count = 0;

        while (i < 1000) {
            i = i + 4;
            count++;
        }

        System.out.println(count);
    }
}
