package com.example.exercise;

public class Main {
    public static void main(String[] args) {
        int from = 100;
        int to = 1;

        Util util = new Util();

        util.countBackwards(from, to);
        System.out.println("Number divisible by 3 and 5: " + util.getCountNumberDivisibleBy3And5());
        System.out.println("Number divisible by 3: " + util.getCountNumberDivisibleBy3());
        System.out.println("Number divisible by 5: " + util.getCountNumberDivisibleBy5());
        System.out.println("Number not divisible by 3 and 5, 3 or 5: " +
                (100 - (util.getCountNumberDivisibleBy3And5() + util.getCountNumberDivisibleBy3() + util.getCountNumberDivisibleBy5())));
    }
}
