package com.example.demo.builder;


/**
 * @author blankjee
 * @date 2021/1/14 20:55:35
 */
public class Test {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("VegMeal");
        vegMeal.showItems();
        System.out.println("Cost: " + vegMeal.getCost());
    }
}
