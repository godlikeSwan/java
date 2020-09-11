package func;

import java.util.*;
public class RandomSort {
    public static void main (String[] args) {
        int j = (int) (Math.random() * 99 + 1);
        int[] arr = new int[j];
        for (int i = 0; i < j; i += 1) arr[i] = (int) (Math.random() * 99 + 1);
        System.out.println(Arrays.sort(arr));
    }
}