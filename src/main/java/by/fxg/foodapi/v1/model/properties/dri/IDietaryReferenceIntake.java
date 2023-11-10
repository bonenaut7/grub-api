package by.fxg.foodapi.v1.model.properties.dri;

import by.fxg.foodapi.v1.model.units.IMeasurmentValue;

/** @deprecated not implemented **/
@Deprecated
public interface IDietaryReferenceIntake<UNIT extends IMeasurmentValue<UNIT>> {
	
	UNIT getIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType);
	
	IDietaryReferenceIntake<UNIT> setIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType, UNIT unit);
}

/*
PropertyDRI<IDietaryReferenceIntake<WeightValue>>

protected IDietaryReferenceIntake<WeightValue> dietaryReferenceIntake;

@Override
public IDietaryReferenceIntake<WeightValue> getDietaryReferenceIntake() {
	return this.dietaryReferenceIntake;
}
*/