package com.tk.iterator;

public class Main {

    public static void main(String[] args) {
        Collention_ list = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        Iterator_ iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
