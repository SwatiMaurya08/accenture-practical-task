package com.example.exercise;


public class Util {
    /**
     * counter for number divisible by 3
     **/
    private int countNumberDivisibleBy3 = 0;
    /**
     * counter for number divisible by 5
     **/
    private int countNumberDivisibleBy5 = 0;
    /**
     * counter for number divisible by 3 & 5
     **/
    private int countNumberDivisibleBy3And5 = 0;

    /**
     * Method takes input "from" & "to" to count number backwards.
     * It prints "Agile" if number is divisible by 5,
     * "Software" if number is divisible by 3,
     * "Testing" if number is divisible by both.
     * Otherwise it prints the number.
     *
     * @param from number to count from
     * @param to   last number to count
     **/
    public void countBackwards(int from, int to) {
        // loop count backward "from" until "to"
        for (int count = from; count >= to; count--) { //O(n)

            // if number is divisible by 3 & 5
            if (checkDivisiblityBy(count, 3) && checkDivisiblityBy(count, 5)) {
                countNumberDivisibleBy3And5++;
                System.out.println(count + " " + "Testing");
            }
            // If number is divisible by 3
            else if (checkDivisiblityBy(count, 3)) {
                countNumberDivisibleBy3++;
                System.out.println(count + " " + "Software");
            }
            // If number is divisible by 5
            else if (checkDivisiblityBy(count, 5)) {
                countNumberDivisibleBy5++;
                System.out.println(count + " " + "Agile");
            }
            else {
                // print the number
                System.out.println(count);
            }
        }
    }

    /**
     * Method to check divisibilty of a number by divisor
     *
     * @param number  input number to be check for divisiblity
     * @param divisor number with which number is to be divided
     * @return boolean
     **/
    private boolean checkDivisiblityBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public int getCountNumberDivisibleBy3() {
        return countNumberDivisibleBy3;
    }

    public int getCountNumberDivisibleBy5() {
        return countNumberDivisibleBy5;
    }

    public int getCountNumberDivisibleBy3And5() {
        return countNumberDivisibleBy3And5;
    }

}
