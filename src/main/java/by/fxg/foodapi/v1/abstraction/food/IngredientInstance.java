package by.fxg.foodapi.v1.abstraction.food;

import java.util.Collection;

import by.fxg.foodapi.v1.model.food.IIngredient;
import by.fxg.foodapi.v1.model.food.IIngredientInstance;
import by.fxg.foodapi.v1.model.food.IIngredientWrapper;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class IngredientInstance implements IIngredientInstance, IIngredientWrapper {
	protected IIngredient ingredient;
	protected WeightValue relativeWeight;

	@Override
	public IIngredient getIngredient() {
		return this.ingredient;
	}

	@Override
	public WeightValue getRelativeWeight() {
		return this.relativeWeight;
	}

	@Override
	public double getRelativeScale() {
		return this.relativeWeight.get(WeightUnit.GRAM) / this.ingredient.getSampleWeight().get(WeightUnit.GRAM);
	}
	
	@Override
	public IIngredientInstance getIngredientInstance() {
		return this;
	}
	
	@Override
	public boolean isReplaceableIngredientInstance() {
		return false;
	}

	@Override
	public Collection<IIngredient> getReplaceableIngredientInstances() {
		return null;
	}
}
