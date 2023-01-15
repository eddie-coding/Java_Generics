package com.eddie.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers);

        

        
    }

    public static void printList(List<?> names) {
        names.forEach(System.out::println);
    }
    
}
