package cn.luotuoyulang.designpattern.builder;

/**
 * 指挥者类 KFCWaiter
 */
public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb){
        this.mb = mb;
    }

    public Meal constuct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
