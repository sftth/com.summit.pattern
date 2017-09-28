package com.summit.pattern.builder.concret;

import com.summit.pattern.builder.abstrac.PizzaBuilder;

/**
 * @author 74469
 * ConcreteBuilder
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("peperoni+salami");
	}

}
