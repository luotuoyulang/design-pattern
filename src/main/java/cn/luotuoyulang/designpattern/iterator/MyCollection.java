package cn.luotuoyulang.designpattern.iterator;

/**
 * Aggregate(抽象聚合类)
 */
public interface MyCollection {

    MyIterator createIterator();
}
