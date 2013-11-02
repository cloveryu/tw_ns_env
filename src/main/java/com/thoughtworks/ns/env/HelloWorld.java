package com.thoughtworks.ns.env;

import static java.lang.Integer.MIN_VALUE;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int sum(int... toSums) {
        int total = 0;
        for (int i : toSums) {
            total += i;
        }
        return total;
    }

    public static int max(int... nums) {
        int max = MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

