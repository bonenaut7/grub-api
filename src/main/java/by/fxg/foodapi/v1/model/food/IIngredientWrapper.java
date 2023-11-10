package by.fxg.foodapi.v1.model.food;

import java.util.Collection;

public interface IIngredientWrapper {
	IIngredientInstance getIngredientInstance();
	
	boolean isReplaceableIngredientInstance();
	
	Collection<IIngredient> getReplaceableIngredientInstances();
}
