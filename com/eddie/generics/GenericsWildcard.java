package com.eddie.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard {

    public static void main(String[] args) {
        
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);
        printList(doubles);

        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1.0);

        
    }

    public static void addToList(List<? super Number> numbers, Number i) {        // lower bound Generics
        numbers.add(i);
    }
 
    public static void printList(List<? extends Number> numbers) {               // upper bound Generics
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
        System.out.println("index 0:"+ number);

        
    }

// PECS--> Producer Extends Consumer Super 
    
}
