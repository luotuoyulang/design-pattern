package cn.luotuoyulang.designpattern.builder;

/**
 * 具体 建造者类 SubMealBuilderB (B 套餐的建造者类)
 */
public class SubMealBuilderB extends MealBuilder{

    @Override
    public void buildFood() {
        System.out.println("一个鸡肉卷。。");
    }

    @Override
    public void buildDrink() {
        System.out.println("一杯果汁。。");
    }
}
