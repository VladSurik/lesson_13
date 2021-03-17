package com.company;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntList();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(20);
        System.out.println(list.get(2));
        list.set(1, 123);
        System.out.println(list.size());
        System.out.println(list);
    }
}
