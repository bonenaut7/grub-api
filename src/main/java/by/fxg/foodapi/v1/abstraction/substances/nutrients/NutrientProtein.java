package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import java.util.Collection;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrient;
import by.fxg.foodapi.v1.model.properties.PropertyEnergyValue;
import by.fxg.foodapi.v1.model.properties.PropertyNutrientCompound;
import by.fxg.foodapi.v1.model.units.energy.EnergyUnit;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class NutrientProtein extends AbstractNutrient implements PropertyNutrientCompound<NutrientAminoacid>, PropertyEnergyValue<WeightValue> {
	protected Collection<NutrientAminoacid> componentNutrients;
	
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.PROTEIN;
	}
	
	@Override
	public Collection<NutrientAminoacid> getComponentNutrients() {
		return this.componentNutrients;
	}
	
	@Override
	public EnergyValue getEnergyValue(WeightValue amount) {
		// Approx. energy value of proteins is 4 kcal per gram
		return EnergyValue.of(EnergyUnit.KILOCALORIE, amount.get(WeightUnit.GRAM) * 4);
	}
}
