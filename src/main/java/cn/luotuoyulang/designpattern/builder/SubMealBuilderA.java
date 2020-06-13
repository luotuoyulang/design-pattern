package cn.luotuoyulang.designpattern.builder;

/**
 * 具体 建造者类 SubMealBuilderA (A 套餐的建造者类)
 */
public class SubMealBuilderA extends MealBuilder{

    @Override
    public void buildFood() {
        System.out.println("一个鸡腿堡。。");
    }

    @Override
    public void buildDrink() {
        System.out.println("一杯可乐。。");
    }
}
