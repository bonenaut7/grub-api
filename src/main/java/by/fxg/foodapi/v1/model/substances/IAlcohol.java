package by.fxg.foodapi.v1.model.substances;

import by.fxg.foodapi.v1.model.properties.PropertyEnergyValue;
import by.fxg.foodapi.v1.model.units.energy.EnergyUnit;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public interface IAlcohol extends ISubstance, PropertyEnergyValue<WeightValue> {
	
	default EnergyValue getEnergyValue(WeightValue amount) {
		// Approx. energy value of alcohol is 9 kcal per gram
		return EnergyValue.of(EnergyUnit.KILOCALORIE, amount.get(WeightUnit.GRAM) * 7);
	}
}
