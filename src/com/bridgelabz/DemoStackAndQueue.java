package com.bridgelabz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(56);
        numbers.push(30);
        numbers.push(70);
        System.out.println(numbers);

        for (int i =0; i<=numbers.size();i++){
            if (numbers.get(i) != 0){
                numbers.pop();
            }
            System.out.println(numbers);
        }
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
    }
}