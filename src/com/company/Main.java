package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList);
        System.out.println(arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        System.out.println(arrayList.stream().filter(n -> n % 2 == 0).map(i -> i * i).collect(Collectors.toList()));
        System.out.println(arrayList.stream().filter(n -> n % 2 == 0).map(i -> i * i).max(Comparator.naturalOrder()).get());
    }
}
