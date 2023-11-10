package by.fxg.foodapi.v1.abstraction.food;

import java.util.Collection;

import by.fxg.foodapi.v1.model.food.IIngredient;
import by.fxg.foodapi.v1.model.instances.ISubstanceInstance;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class Ingredient implements IIngredient {
	protected String name;
	protected WeightValue sampleWeight;
	protected Collection<ISubstanceInstance<?>> components;
	protected Collection<String> foodDictionaries;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public WeightValue getSampleWeight() {
		return this.sampleWeight;
	}

	@Override
	public Collection<ISubstanceInstance<?>> getComponents() {
		return this.components;
	}

	@Override
	public Collection<String> getFoodDictionaries() {
		return this.foodDictionaries;
	}
}
