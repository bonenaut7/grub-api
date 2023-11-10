package by.fxg.foodapi.v1.model.food;

import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public interface IIngredientInstance {
	IIngredient getIngredient();
	WeightValue getRelativeWeight();
	double getRelativeScale();
}
