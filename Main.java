import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        byte by = -13;
        short sh = 1000;
        int i = 67;
        long l = 39009284783278l;
        float f = -3.99f;
        double d = 779303028.3398;
        char c1 = 'Z';
        char c2 = 90;
        boolean bb = false;
        boolean b = true;
        System.out.println("Максимальне число = " + Math.max(f, d));
        System.out.println("Мінімальне число = " + Math.min(f, d));

        int[] array = {33, 12, 128, 45, 74, 13, 5, 88, 59, 113};
        Arrays.sort(array);
        System.out.println("Максимальне число в масиві = "+ array[0]);
        System.out.println("Максимальне число в масиві = "+ array[9]);
    }
}