package cn.luotuoyulang.designpattern.iterator;

/**
 * Iterator(抽象迭代器)
 */
public interface MyIterator {

    /**
     * 获取第一个元素
     */
    void first();

    /**
     * 访问一下个元素
     */
    void next();

    /**
     * 是否是最后一个元素
     * @return
     */
    boolean isLast();

    /**
     * 访问一下个元素
     * @return
     */
    Object currentItem();
}
