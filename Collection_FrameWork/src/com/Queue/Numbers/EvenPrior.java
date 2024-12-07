package com.Queue.Numbers;

import java.util.Comparator;

public class EvenPrior implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // Prioritize even numbers
        if (o1 % 2 == 0 && o2 % 2 != 0) return -1; // o1 is even, o2 is odd
        if (o1 % 2 != 0 && o2 % 2 == 0) return 1;  // o1 is odd, o2 is even
        return Integer.compare(o1, o2); // Ascending order for both even or both odd
    }
}
