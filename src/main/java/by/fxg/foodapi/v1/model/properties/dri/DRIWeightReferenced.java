package by.fxg.foodapi.v1.model.properties.dri;

import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class DRIWeightReferenced extends DRIWeight {
	private WeightUnit referenceUnitType;
	
	public DRIWeightReferenced(WeightUnit referenceUnitType) {
		this.referenceUnitType = referenceUnitType;
	}

	@Override
	public DRIWeightReferenced setIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType, WeightValue unit) {
		if (dietaryReferenceIntakeType != null) {
			values[dietaryReferenceIntakeType.ordinal()] = unit.convertToUnit(this.referenceUnitType);
		}
		return this;
	}
}
