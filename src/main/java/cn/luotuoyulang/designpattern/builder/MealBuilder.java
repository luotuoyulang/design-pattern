package cn.luotuoyulang.designpattern.builder;

/**
 * 抽象建造者类 MealBuilder(套餐建造者类)
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    // 抽象部件得组长方法
    public abstract void buildFood();
    public abstract void buildDrink();

    /**
     * 提供工厂方法getMeal()返回meal对象
     * @return
     */
    public Meal getMeal(){
        return meal;
    }
}
