package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
    public static void main(String[] args) {
        double[] array = {0.8, 0.2, 0.5, 0.7, 0.1, 0.6};

        System.out.println("Original array:");
        printArray(array);

        bucketSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void bucketSort(double[] array) {
        int n = array.length;

        // Create buckets
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add elements to buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets[bucketIndex].add(array[i]);
        }

        // Sort each bucket
        for (ArrayList<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate the sorted buckets back into the original array
        int index = 0;
        for (ArrayList<Double> bucket : buckets) {
            for (double value : bucket) {
                array[index++] = value;
            }
        }
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

