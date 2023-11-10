package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrientLipid;
import by.fxg.foodapi.v1.model.properties.PropertyEnergyValue;
import by.fxg.foodapi.v1.model.units.energy.EnergyUnit;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class NutrientLipidFattyAcid extends AbstractNutrientLipid implements PropertyEnergyValue<WeightValue> {
	protected NutrientLipidFattyAcidType fattyAcidType;
	
	@Override
	public NutrientType getNutrientType() {
		return NutrientType.FATTY_ACID;
	}
	
	@Override
	public EnergyValue getEnergyValue(WeightValue amount) {
		// Approx. energy value of fats is 9 kcal per gram
		return EnergyValue.of(EnergyUnit.KILOCALORIE, amount.get(WeightUnit.GRAM) * 9);
	}
	
	public NutrientLipidFattyAcidType getFattyAcidType() {
		return this.fattyAcidType;
	}
}
