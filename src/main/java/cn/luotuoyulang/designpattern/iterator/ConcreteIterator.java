package cn.luotuoyulang.designpattern.iterator;

import java.util.Iterator;

public class ConcreteIterator implements MyIterator {

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public boolean isLast() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
