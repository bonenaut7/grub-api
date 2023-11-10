package by.fxg.foodapi.v1.abstraction.substances;

import by.fxg.foodapi.v1.model.substances.INutrient;

// Strange combo of extends ParentOf<ISubstance> implements ParentOf<ISubstance>, aren't it?
public abstract class AbstractNutrient extends AbstractSubstance implements INutrient {
	protected boolean isEssentialNutrient;

	@Override
	public boolean isEssentialNutrient() {
		return this.isEssentialNutrient;
	}
}
