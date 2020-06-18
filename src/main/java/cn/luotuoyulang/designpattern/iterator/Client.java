package cn.luotuoyulang.designpattern.iterator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        NewCollection collection = new NewCollection();
        process(collection);
    }

    private static void process(NewCollection collection) {
        MyIterator i = collection.createIterator();
        while (!i.isLast()){
            System.out.println(i.currentItem().toString());
            i.next();
        }
    }
}
