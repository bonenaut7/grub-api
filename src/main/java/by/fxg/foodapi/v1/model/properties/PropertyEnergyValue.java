package by.fxg.foodapi.v1.model.properties;

import by.fxg.foodapi.v1.model.units.IMeasurmentValue;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;

public interface PropertyEnergyValue<UNIT extends IMeasurmentValue<UNIT>> {
	EnergyValue getEnergyValue(UNIT amount);
}
