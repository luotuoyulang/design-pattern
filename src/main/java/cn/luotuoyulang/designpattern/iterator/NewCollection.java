package cn.luotuoyulang.designpattern.iterator;

/**
 * ConcreteAggregate(具体聚合类)
 * 一般将具体迭代器类作为具体聚合类的内部类,
 * 从而迭代器可以实现直接访问聚合类中的数据
 */
public class NewCollection implements MyCollection {

    private Object[] obj = {"dog","pig","monkey","pig"};

    @Override
    public MyIterator createIterator() {
        return new NewIterator();
    }

    /**
     * 具体迭代器
     */
    private class NewIterator implements MyIterator{

        private int currentIndex = 0;

        @Override
        public void first() {
            currentIndex = 0;
        }

        @Override
        public void next() {
            if(currentIndex < obj.length){
                currentIndex ++;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == obj.length;
        }

        @Override
        public Object currentItem() {
            return obj[currentIndex];
        }
    }
}
