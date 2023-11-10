package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrient;

public abstract class NutrientMineral extends AbstractNutrient {
	// Essential: Calcium, Chloride, Chromium, Copper, Fluoride, Iodine, Iron, Magnesium, Manganese,
	// 				Molybdenum, Phosphorus, Potassium, Selenium, Sodium, Zinc
	// Non-Essential: Arsenic, Boron, Nickel, Silocon, Sulfate, Vanadium
	
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.MINERAL;
	}
}
