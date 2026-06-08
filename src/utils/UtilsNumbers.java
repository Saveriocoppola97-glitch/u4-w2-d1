package utils;
import java.util.Random;

public class UtilsNumbers {
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }
    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("]");
    }
}