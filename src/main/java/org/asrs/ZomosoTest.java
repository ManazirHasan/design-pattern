package org.asrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ZomosoTest {

    public static void main(String[] args) {
        // 5th largest from integer matrix
        //int x = fifthLargestMatrics();
        //System.out.println(x);
        int target = -3;
        int x = closetNumber(target, new int[]{2, -2, 4, 5, -1});//-2,-1,2,4,5
        System.out.println(x);
    }

    private static int closetNumber(int target, int[] number) {
        Arrays.sort(number);
        Arrays.stream(number).forEach(System.out::print);
        System.out.println("\n");
        int value = number[0];
        int i = 0;
        for (; i < number.length; i++) {
            if (target < number[i] && i > 0) {
                value = number[i - 1];
                break;
            }
        }
        if (i == number.length) {
            return number[i - 1];
        } else if (i == 0)
            return number[i];
        else
            return value;

    }

    private static int fifthLargestMatrics() {
        int[][] x = {{10, 13, 22}, {4, 17, 1}, {6, 12, 15}};
        List<Integer> collection = Arrays.stream(x).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
        collection.sort(Comparator.naturalOrder());
        collection.stream().forEach(System.out::print);
        System.out.println("\n");
        int max5thValue = collection.get(0);
        int count = 0;
        for (Integer value : collection) {
            if (max5thValue < value) {
                max5thValue = value;
                count++;
                if (count == 4) {
                    break;
                }
            }
        }
        return max5thValue;
    }
}