package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:46:03
 */
public class MealBuilder {

    /**
     * 蔬菜套餐
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 荤菜套餐
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
