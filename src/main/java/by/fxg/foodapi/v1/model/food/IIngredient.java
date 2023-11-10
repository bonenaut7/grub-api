package by.fxg.foodapi.v1.model.food;

import java.util.Collection;

import by.fxg.foodapi.v1.model.instances.ISubstanceInstance;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public interface IIngredient {
	String getName();
	
	WeightValue getSampleWeight();
	
	Collection<ISubstanceInstance<?>> getComponents();
	
	Collection<String> getFoodDictionaries();
}
