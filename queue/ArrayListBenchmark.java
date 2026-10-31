package com.springcore.datastructure.queue;

import java.util.ArrayList;

public class ArrayListBenchmark {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1_000_000);

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long start = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();

        System.out.println(
            "Time: " + (end - start) / 1_000_000.0 + " ms"
        );
    }
}
