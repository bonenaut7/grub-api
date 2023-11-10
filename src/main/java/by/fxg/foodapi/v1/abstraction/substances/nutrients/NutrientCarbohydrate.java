package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrient;
import by.fxg.foodapi.v1.model.properties.PropertyEnergyValue;
import by.fxg.foodapi.v1.model.properties.PropertyGlycemicIndex;
import by.fxg.foodapi.v1.model.units.energy.EnergyUnit;
import by.fxg.foodapi.v1.model.units.energy.EnergyValue;
import by.fxg.foodapi.v1.model.units.glycemicindex.GlycemicIndex;
import by.fxg.foodapi.v1.model.units.weight.WeightUnit;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class NutrientCarbohydrate extends AbstractNutrient implements PropertyEnergyValue<WeightValue>, PropertyGlycemicIndex<GlycemicIndex> {
	protected GlycemicIndex glycemicIndex;
	protected NutrientCarbohydrateType carbohydrateType;
	
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.CARBOHYDRATE;
	}
	
	@Override
	public EnergyValue getEnergyValue(WeightValue amount) {
		// Approx. energy value of carbohydrates is 4 kcal per gram
		return EnergyValue.of(EnergyUnit.KILOCALORIE, amount.get(WeightUnit.GRAM) * 4);
	}
	
	@Override
	public GlycemicIndex getGlycemicIndex(GlycemicIndex amount) {
		return this.glycemicIndex;
	}
	
	public NutrientCarbohydrateType getCarbohydrateType() {
		return this.carbohydrateType;
	}
	
	
	//types: simple (fast-digestable), complex (slow-digestable), fiber (moves out stuck poop from your intestine)
	
	// ingredients index = [for, 50, 90]
	// weight per ingredient = [500g, 200g, 100g]
	// totalIndex = (every (index * weight)) / total (weight)
	
/*
	for example i have 30% of first ingredient, 70% of other ingredient, so i should calculate gi like that:
		<code> Total_GI = (GI_First * 0.3 + GI_Second * 0.7) / 2 </code>
	And then i should use that value to calculate by human weight
		<code> GI_Effective = Total_GI / Human_Weight * 0.01 </code>
*/
}
