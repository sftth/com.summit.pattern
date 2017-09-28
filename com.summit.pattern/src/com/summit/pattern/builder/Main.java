package com.summit.pattern.builder;

import com.summit.pattern.builder.abstrac.PizzaBuilder;
import com.summit.pattern.builder.concret.HawaiianPizzaBuilder;
import com.summit.pattern.builder.concret.SpicyPizzaBuilder;
import com.summit.pattern.builder.model.Pizza;

public class Main {
	public static void main(String[] args) {
		Cook cook = new Cook();
		PizzaBuilder hawaiilanPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		//builder를 생성자로 넘기지 않고 builder 패턴으로 전달.
		cook.setPizzaBuilder(hawaiilanPizzaBuilder);
		cook.constructPizza();
		
		Pizza pizza = cook.getPizza();
		String dough = pizza.getDough();
		String sauce = pizza.getSauce();
		String topping = pizza.getTopping();
		System.err.println("Dough: " + dough + "\nSauce: " + sauce + "\nTopping: " + topping);
	}
}
