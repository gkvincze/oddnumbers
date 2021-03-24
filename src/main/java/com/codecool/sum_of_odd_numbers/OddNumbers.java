package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        int sum = numbers.stream()
                .filter(n -> n % 2 == 1 || n % 2 == -1)
                .reduce(0, Integer::sum);
        return sum;
    }
}