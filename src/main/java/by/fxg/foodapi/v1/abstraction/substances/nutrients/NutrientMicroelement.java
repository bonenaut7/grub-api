package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrient;

public abstract class NutrientMicroelement extends AbstractNutrient {
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.MICROELEMENT;
	}
}
