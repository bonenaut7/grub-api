package by.fxg.foodapi.v1.model.properties.dri;

import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class DRIWeight implements IDietaryReferenceIntake<WeightValue> {
	protected WeightValue[] values = new WeightValue[DietaryReferenceIntakeType.SIZE];

	@Override
	public WeightValue getIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType) {
		return dietaryReferenceIntakeType != null ? values[dietaryReferenceIntakeType.ordinal()] : null;
	}

	@Override
	public DRIWeight setIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType, WeightValue unit) {
		if (dietaryReferenceIntakeType != null) {
			values[dietaryReferenceIntakeType.ordinal()] = unit;
		}
		return this;
	}
}
