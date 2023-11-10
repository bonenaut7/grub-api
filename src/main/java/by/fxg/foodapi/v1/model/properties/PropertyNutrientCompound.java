package by.fxg.foodapi.v1.model.properties;

import java.util.Collection;

import by.fxg.foodapi.v1.model.substances.INutrient;

/** TODO add docs INutrientCompound 
 *  used for parsing data from components that target object made of **/
public interface PropertyNutrientCompound<TYPE extends INutrient> {
	Collection<TYPE> getComponentNutrients();
}
