package com.summit.pattern.builder.abstrac;

import com.summit.pattern.builder.model.Pizza;

/**
 * @author 74469
 * Abstract Builder
 */
public abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();
	
	public abstract void buildSauce();
	
	public abstract void buildTopping();
}
