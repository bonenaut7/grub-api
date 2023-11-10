package by.fxg.foodapi.v1.model.properties;

import by.fxg.foodapi.v1.model.properties.dri.IDietaryReferenceIntake;

//public interface PropertyDRI<DRI extends IDietaryReferenceIntake<MV>, MV extends IMeasurmentValue<MV>> {
public interface PropertyDRI<DRI extends IDietaryReferenceIntake<?>> {
	DRI getDietaryReferenceIntake();
}
