package by.fxg.foodapi.v1.abstraction.food;

import java.util.Collection;

import by.fxg.foodapi.v1.model.food.IIngredient;
import by.fxg.foodapi.v1.model.food.IIngredientInstance;
import by.fxg.foodapi.v1.model.food.IIngredientWrapper;

@Deprecated
public class FoodDictionaryIngredientInstance implements IIngredientWrapper {
	@Override
	public IIngredientInstance getIngredientInstance() {
		return null;
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
