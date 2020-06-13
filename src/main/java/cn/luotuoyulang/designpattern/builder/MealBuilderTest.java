package cn.luotuoyulang.designpattern.builder;

public class MealBuilderTest {

    public static void main(String[] args) {
        SubMealBuilderA subMealBuilderA = new SubMealBuilderA();
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setMealBuilder(subMealBuilderA);
        Meal constuct = kfcWaiter.constuct();
        System.out.println(constuct.getDrink());
    }
}
