package com.summit.pattern.builder.concret;

import com.summit.pattern.builder.abstrac.PizzaBuilder;

/**
 * @author 74469
 * ConcreteBuilder
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham + pineapple");
	}

}
