package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import java.util.Collection;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrientLipid;
import by.fxg.foodapi.v1.model.properties.PropertyEnergyValue;
import by.fxg.foodapi.v1.model.properties.PropertyNutrientCompound;
import by.fxg.foodapi.v1.model.units.energy.EnergyUnit;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class NutrientLipidFat extends AbstractNutrientLipid implements PropertyNutrientCompound<AbstractNutrientLipid>, PropertyEnergyValue<WeightValue> {
	protected Collection<AbstractNutrientLipid> componentNutrients;
	protected NutrientLipidFatGroup fatGroup;
	
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.FAT;
	}
	
	@Override
	public EnergyValue getEnergyValue(WeightValue amount) {
		// Approx. energy value of fats is 9 kcal per gram
		return EnergyValue.of(EnergyUnit.KILOCALORIE, amount.get(WeightUnit.GRAM) * 9);
	}
	
	@Override
	public Collection<AbstractNutrientLipid> getComponentNutrients() {
		return this.componentNutrients;
	}
	
	public NutrientLipidFatGroup getFatGroup() {
		return this.fatGroup;
	}
}
