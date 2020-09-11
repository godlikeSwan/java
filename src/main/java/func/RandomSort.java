package func;

import java.util.*;
public class RandomSort {
    public static void main (String[] args) {
        int j = (int) (Math.random() * 30 + 1);
        int[] arr1 = new int[j];
        for (int i = 0; i < j; i += 1) {
            arr1[i] = (int) (Math.random() * 99 + 1);
            System.out.print(arr1[i] + " ");
        }
        Arrays.sort(arr1);
        System.out.println();
        for (int i: arr1) System.out.print(i + " ");
        System.out.println();

        final Random rand = new Random();
        j = (int) (rand.nextInt(30) + 1);
        int[] arr = new int[j];
        for (int i = 0; i < j; i += 1) {
            arr[i] = (int) (rand.nextInt(99) + 1);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i: arr) System.out.print(i + " ");
        System.out.println();
    }
}