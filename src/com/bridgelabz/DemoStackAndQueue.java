package com.bridgelabz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStackAndQueue {
    public static void main(String[] args) {
    Queue<Integer> numbers =new LinkedList<>();
    numbers.add(56);
    numbers.add(30);
    numbers.add(70);
    System.out.println(numbers);

    numbers.poll();
        System.out.println(numbers);
    }
}